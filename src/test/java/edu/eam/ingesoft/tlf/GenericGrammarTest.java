package edu.eam.ingesoft.tlf;

import org.antlr.v4.runtime.*;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

/**
 * Clase genérica para probar cualquier gramática ANTLR4 usando reflection.
 * Lee casos de prueba desde un archivo YAML y ejecuta validaciones dinámicamente.
 */
public class GenericGrammarTest {
    
    // Configuración - cambiar estos valores para probar diferentes gramáticas
    private static final String GRAMMAR_NAME = "RoboLang";
    private static final String PACKAGE_NAME = "edu.eam.ingesoft.tlf";
    private static final String YAML_FILE = "RoboLang.yaml";
    private static final String START_RULE = "program"; // Regla inicial de la gramática
    
    // Contadores para estadísticas
    private static int totalCases = 0;
    private static int validCases = 0;
    private static int invalidCases = 0;
    
    @BeforeAll
    static void initTest() {
        System.out.println("\n" + "=".repeat(80));
        System.out.println("INICIANDO PRUEBAS DE GRAMÁTICA: " + GRAMMAR_NAME);
        System.out.println("=".repeat(80));
    }
    
    @TestFactory
    Stream<DynamicTest> testGrammarFromYaml() {
        return createTestsFromYaml(GRAMMAR_NAME, PACKAGE_NAME, YAML_FILE, START_RULE);
    }
    
    @AfterAll
    static void printSummary() {
        System.out.println("\n" + "=".repeat(80));
        System.out.println("RESUMEN DE PRUEBAS - GRAMÁTICA: " + GRAMMAR_NAME);
        System.out.println("=".repeat(80));
        System.out.println("Archivo YAML: " + YAML_FILE);
        System.out.println("Regla inicial: " + START_RULE);
        System.out.println("-".repeat(80));
        System.out.println("Casos de prueba procesados:");
        System.out.println("  • Total: " + totalCases);
        System.out.println("  • Casos que deben ser válidos: " + validCases);
        System.out.println("  • Casos que deben ser inválidos: " + invalidCases);
        System.out.println("=".repeat(80));
    }
    
    /**
     * Crea tests dinámicos desde un archivo YAML para una gramática específica.
     * 
     * @param grammarName Nombre de la gramática (debe coincidir con el archivo .g4)
     * @param packageName Paquete donde se generaron las clases ANTLR
     * @param yamlFile Nombre del archivo YAML con los casos de prueba
     * @param startRule Nombre de la regla inicial de la gramática
     * @return Stream de tests dinámicos
     */
    protected Stream<DynamicTest> createTestsFromYaml(String grammarName, String packageName, 
                                                      String yamlFile, String startRule) {
        Yaml yaml = new Yaml();
        InputStream inputStream = this.getClass()
            .getClassLoader()
            .getResourceAsStream(yamlFile);
        
        if (inputStream == null) {
            fail("No se pudo cargar el archivo " + yamlFile);
        }
        
        Map<String, Object> data = yaml.load(inputStream);
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> ejemplos = (List<Map<String, Object>>) data.get("ejemplos");
        
        if (ejemplos == null) {
            fail("El archivo YAML debe contener una lista 'ejemplos'");
        }
        
        // Contar casos
        totalCases = ejemplos.size();
        validCases = (int) ejemplos.stream().filter(e -> (boolean) e.get("valido")).count();
        invalidCases = totalCases - validCases;
        
        System.out.println("\nCargados " + totalCases + " casos de prueba desde " + yamlFile);
        System.out.println("  • Casos válidos: " + validCases);
        System.out.println("  • Casos inválidos: " + invalidCases);
        System.out.println();
        
        return ejemplos.stream().map(ejemplo -> {
            String nombre = (String) ejemplo.get("nombre");
            boolean valido = (boolean) ejemplo.get("valido");
            String texto = (String) ejemplo.get("texto");
            
            return dynamicTest(nombre, () -> {
                ParseResult result = parseWithReflection(texto, grammarName, packageName, startRule);
                
                if (valido) {
                    assertTrue(result.isValid(), 
                        String.format("El programa '%s' debería ser válido pero tiene errores: %s", 
                            nombre, result.getErrors()));
                } else {
                    assertFalse(result.isValid(), 
                        String.format("El programa '%s' debería ser inválido pero fue aceptado", 
                            nombre));
                }
            });
        });
    }
    
    /**
     * Parsea una entrada usando reflection para cargar dinámicamente el lexer y parser.
     * 
     * @param input Texto a parsear
     * @param grammarName Nombre de la gramática
     * @param packageName Paquete de las clases generadas
     * @param startRule Regla inicial
     * @return Resultado del parsing
     */
    private ParseResult parseWithReflection(String input, String grammarName, 
                                           String packageName, String startRule) {
        ParseResult result = new ParseResult();
        List<String> errors = new ArrayList<>();
        
        try {
            // Cargar clases del lexer y parser
            String lexerClassName = packageName + "." + grammarName + "Lexer";
            String parserClassName = packageName + "." + grammarName + "Parser";
            
            Class<?> lexerClass = Class.forName(lexerClassName);
            Class<?> parserClass = Class.forName(parserClassName);
            
            // Crear CharStream
            CharStream charStream = CharStreams.fromString(input);
            
            // Crear instancia del lexer
            Constructor<?> lexerConstructor = lexerClass.getConstructor(CharStream.class);
            Lexer lexer = (Lexer) lexerConstructor.newInstance(charStream);
            
            // Configurar error listener para el lexer
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer,
                                       Object offendingSymbol,
                                       int line, int charPositionInLine,
                                       String msg,
                                       RecognitionException e) {
                    errors.add(String.format("Lexer - Línea %d:%d - %s", 
                        line, charPositionInLine, msg));
                }
            });
            
            // Crear CommonTokenStream
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // Crear instancia del parser
            Constructor<?> parserConstructor = parserClass.getConstructor(TokenStream.class);
            Parser parser = (Parser) parserConstructor.newInstance(tokens);
            
            // Configurar error listener para el parser
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer,
                                       Object offendingSymbol,
                                       int line, int charPositionInLine,
                                       String msg,
                                       RecognitionException e) {
                    errors.add(String.format("Parser - Línea %d:%d - %s", 
                        line, charPositionInLine, msg));
                }
            });
            
            // Buscar y ejecutar el método de la regla inicial
            Method startRuleMethod = parserClass.getMethod(startRule);
            Object parseTree = startRuleMethod.invoke(parser);
            
            // Configurar resultado
            result.setValid(errors.isEmpty());
            result.setErrors(errors);
            result.setParseTree(parseTree);
            result.setGrammarName(grammarName);
            
        } catch (ClassNotFoundException e) {
            fail(String.format("No se pudieron encontrar las clases del lexer o parser. " +
                "Asegúrate de que ANTLR haya generado las clases %s y %s en el paquete %s",
                grammarName + "Lexer", grammarName + "Parser", packageName));
        } catch (NoSuchMethodException e) {
            fail(String.format("No se encontró el método '%s' en el parser. " +
                "Verifica que sea la regla inicial correcta de la gramática.", startRule));
        } catch (Exception e) {
            fail("Error al parsear con reflection: " + e.getMessage());
        }
        
        return result;
    }
    
    /**
     * Clase para almacenar el resultado del parsing
     */
    public static class ParseResult {
        private boolean valid;
        private List<String> errors = new ArrayList<>();
        private Object parseTree;
        private String grammarName;
        
        public boolean isValid() {
            return valid;
        }
        
        public void setValid(boolean valid) {
            this.valid = valid;
        }
        
        public List<String> getErrors() {
            return errors;
        }
        
        public void setErrors(List<String> errors) {
            this.errors = errors;
        }
        
        public Object getParseTree() {
            return parseTree;
        }
        
        public void setParseTree(Object parseTree) {
            this.parseTree = parseTree;
        }
        
        public String getGrammarName() {
            return grammarName;
        }
        
        public void setGrammarName(String grammarName) {
            this.grammarName = grammarName;
        }
        
        @Override
        public String toString() {
            return String.format("ParseResult[grammar=%s, valid=%s, errors=%d]",
                grammarName, valid, errors.size());
        }
    }
}