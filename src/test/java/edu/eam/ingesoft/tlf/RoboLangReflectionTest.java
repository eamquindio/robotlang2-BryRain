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

public class RoboLangReflectionTest {
    
    private static final String GRAMMAR_NAME = "RoboLang";
    private static final String PACKAGE_NAME = "edu.eam.ingesoft.tlf";
    
    @TestFactory
    Stream<DynamicTest> testRoboLangWithReflection() {
        Yaml yaml = new Yaml();
        InputStream inputStream = this.getClass()
            .getClassLoader()
            .getResourceAsStream("RoboLang.yaml");
        
        if (inputStream == null) {
            fail("No se pudo cargar el archivo RoboLang.yaml");
        }
        
        Map<String, Object> data = yaml.load(inputStream);
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> ejemplos = (List<Map<String, Object>>) data.get("ejemplos");
        
        return ejemplos.stream().map(ejemplo -> {
            String nombre = (String) ejemplo.get("nombre");
            boolean valido = (boolean) ejemplo.get("valido");
            String texto = (String) ejemplo.get("texto");
            
            return dynamicTest(nombre, () -> {
                ParseResult result = parseWithReflection(texto);
                
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
    
    private ParseResult parseWithReflection(String input) {
        ParseResult result = new ParseResult();
        List<String> errors = new ArrayList<>();
        
        try {
            // Cargar clases del lexer y parser
            Class<?> lexerClass = Class.forName(PACKAGE_NAME + "." + GRAMMAR_NAME + "Lexer");
            Class<?> parserClass = Class.forName(PACKAGE_NAME + "." + GRAMMAR_NAME + "Parser");
            
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
                    errors.add("Línea " + line + ":" + charPositionInLine + " - " + msg);
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
                    errors.add("Línea " + line + ":" + charPositionInLine + " - " + msg);
                }
            });
            
            // Buscar y ejecutar el método de la regla inicial (program)
            Method programMethod = parserClass.getMethod("program");
            Object parseTree = programMethod.invoke(parser);
            
            // Configurar resultado
            result.setValid(errors.isEmpty());
            result.setErrors(errors);
            result.setParseTree(parseTree);
            
        } catch (ClassNotFoundException e) {
            fail("No se pudieron encontrar las clases del lexer o parser. Asegúrate de que ANTLR haya generado las clases en el paquete " + PACKAGE_NAME);
        } catch (NoSuchMethodException e) {
            fail("No se encontró el método requerido: " + e.getMessage());
        } catch (Exception e) {
            fail("Error al parsear con reflection: " + e.getMessage());
        }
        
        return result;
    }
    
    /**
     * Clase interna para almacenar el resultado del parsing
     */
    private static class ParseResult {
        private boolean valid;
        private List<String> errors = new ArrayList<>();
        private Object parseTree;
        
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
    }
}