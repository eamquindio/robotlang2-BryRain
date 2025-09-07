[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/DU8eR-7Y)
# 🤖 Proyecto RoboLang - Teoría de Lenguajes Formales

## 📚 Descripción del Proyecto

Este proyecto es una tarea práctica del curso de **Teoría de Lenguajes Formales** donde deberás diseñar e implementar un analizador léxico y sintáctico para **RoboLang**, un mini-lenguaje de programación para controlar robots.

## 🎯 Objetivos de Aprendizaje

Al completar esta tarea, serás capaz de:
1. Diseñar una **Gramática Libre de Contexto (GLC)** para un lenguaje de programación
2. Expresar la gramática en notación **BNF (Backus-Naur Form)**
3. Implementar la gramática usando **ANTLR4**
4. Crear y ejecutar casos de prueba para validar la gramática
5. Comprender la diferencia entre análisis léxico y sintáctico

## 📋 Requisitos del Sistema

- **Java JDK 11** o superior
- **Maven 3.6** o superior
- **Git** para control de versiones
- Un IDE como IntelliJ IDEA, Eclipse o VS Code (recomendado con extensión ANTLR4)

## 🚀 Estructura del Proyecto

```
robot-lang/
├── src/
│   ├── main/
│   │   ├── antlr4/
│   │   │   └── edu/eam/ingesoft/tlf/
│   │   │       └── RoboLang.g4         ← TU GRAMÁTICA AQUÍ
│   │   └── java/
│   │       └── edu/eam/ingesoft/tlf/
│   │           └── [Clases generadas por ANTLR]
│   └── test/
│       ├── java/
│       │   └── edu/eam/ingesoft/tlf/
│       │       ├── RoboLangReflectionTest.java
│       │       └── GenericGrammarTest.java
│       └── resources/
│           └── RoboLang.yaml           ← CASOS DE PRUEBA AQUÍ
├── pom.xml                             ← Configuración Maven
├── GRAMATICA_BNF.md                    ← TU DOCUMENTACIÓN AQUÍ
└── README.md                           ← Este archivo
```

## 📝 Tareas a Completar

### 1️⃣ Diseñar la Gramática Libre de Contexto (GLC)

**¿Qué debes hacer?**
- Analizar los requisitos del lenguaje RoboLang (ver sección "Especificación del Lenguaje")
- Identificar los elementos léxicos (tokens) del lenguaje
- Definir las reglas de producción para la gramática
- Asegurar que la gramática sea **no ambigua**

**Entregable:** Documento con la GLC formal

### 2️⃣ Expresar la Gramática en BNF

**¿Qué debes hacer?**
- Convertir tu GLC a notación BNF estándar
- Documentar cada regla de producción
- Incluir explicaciones sobre precedencia de operadores
- Justificar las decisiones de diseño

**Archivo a crear:** `GRAMATICA_BNF.md`

**Estructura sugerida del documento:**
```markdown
# Gramática BNF de RoboLang

## Símbolos Terminales
[Lista todos los tokens del lenguaje]

## Símbolos No Terminales
[Lista todas las reglas]

## Reglas de Producción
<program> ::= ...
<statement> ::= ...
[etc.]

## Precedencia de Operadores
[Explica la precedencia]

## Justificación de Diseño
[Explica tus decisiones]
```

### 3️⃣ Implementar la Gramática en ANTLR4

**¿Qué debes hacer?**
- Traducir tu gramática BNF a sintaxis ANTLR4
- Definir las reglas del parser (empiezan con minúscula)
- Definir las reglas del lexer (empiezan con mayúscula)
- Manejar comentarios y espacios en blanco

**Archivo a modificar:** `src/main/antlr4/edu/eam/ingesoft/tlf/RoboLang.g4`

**Estructura básica de ANTLR4:**
```antlr
grammar RoboLang;

// ===== PARSER RULES (minúscula) =====
program : /* tu regla aquí */ ;
statement : /* tu regla aquí */ ;
// ... más reglas del parser

// ===== LEXER RULES (MAYÚSCULA) =====
UP : 'UP' ;
DOWN : 'DOWN' ;
// ... más tokens

// Manejo de espacios y comentarios
WS : [ \t\r\n]+ -> skip ;
COMMENT : '/*' .*? '*/' -> skip ;
```

### 4️⃣ Verificar con los Casos de Prueba Existentes

**⚠️ IMPORTANTE:** Los casos de prueba YA ESTÁN DEFINIDOS en el archivo `src/test/resources/RoboLang.yaml`. 
**NO debes crear nuevos casos de prueba ni modificar los existentes.**

**¿Qué debes hacer?**
- Tu gramática debe pasar TODOS los 99 casos de prueba predefinidos
- Hay 54 programas válidos que tu gramática debe aceptar
- Hay 45 programas inválidos que tu gramática debe rechazar
- Analiza los casos de prueba existentes para entender qué debe soportar tu gramática

**Archivo de pruebas (NO MODIFICAR):** `src/test/resources/RoboLang.yaml`

## 🤖 Especificación del Lenguaje RoboLang

### Comandos Básicos de Movimiento
- `UP;` - Mover hacia arriba
- `DOWN;` - Mover hacia abajo
- `LEFT;` - Mover hacia la izquierda
- `RIGHT;` - Mover hacia la derecha

### Comandos de Pluma
- `PENUP;` - Levantar la pluma (no dibujar)
- `PENDOWN;` - Bajar la pluma (dibujar)

### Estructura de Repetición
```
REPEAT número {
    // comandos
}
```
Ejemplo: `REPEAT 3 { UP; RIGHT; }`

### Estructura Condicional
```
IF (condición) {
    // comandos si verdadero
} ELSE {
    // comandos si falso (opcional)
}
```

### Bucle While
```
WHILE (condición) {
    // comandos mientras sea verdadero
}
```

### Sensores Disponibles

**Sensores Numéricos:**
- `DIST` - Distancia al obstáculo más cercano
- `TEMP` - Temperatura ambiente
- `LIGHT` - Nivel de luz
- `BATTERY` - Nivel de batería

**Sensor Booleano:**
- `OBSTACLE` - Detecta si hay un obstáculo (true/false)

### Operadores

**Operadores de Comparación:**
- `=` (igual)
- `!=` (diferente)
- `<` (menor que)
- `<=` (menor o igual)
- `>` (mayor que)
- `>=` (mayor o igual)

**Operadores Lógicos (en orden de precedencia):**
1. `NOT` - Negación (mayor precedencia)
2. `AND` - Conjunción
3. `OR` - Disyunción (menor precedencia)

### Comentarios
```
/* Este es un comentario
   que puede ocupar
   múltiples líneas */
```

## 🎯 Ejemplo Completo de RoboLang

Aquí tienes un ejemplo complejo que muestra la mayoría de características del lenguaje:

```robotlang
/* Programa de navegación inteligente para robot */
PENDOWN;  // Empezar a dibujar el camino

/* Secuencia de inicialización */
REPEAT 2 {
    UP; RIGHT; DOWN; LEFT;
}

/* Navegación principal con lógica condicional */
WHILE (BATTERY > 15 AND LIGHT < 85) {
    /* Verificar múltiples sensores para decidir dirección */
    IF (OBSTACLE = false AND DIST > 10) {
        /* Camino libre - avanzar normalmente */
        UP; UP; RIGHT;
    } ELSE {
        /* Obstáculo detectado - buscar ruta alternativa */
        IF (TEMP < 25 OR LIGHT > 50) {
            /* Condiciones favorables - intentar rodear */
            LEFT; 
            REPEAT 3 { UP; }
            RIGHT; RIGHT;
        } ELSE {
            /* Condiciones desfavorables - retroceder */
            IF (NOT (BATTERY <= 20)) {
                DOWN; DOWN; LEFT;
            }
        }
    }
    
    /* Verificación de seguridad */
    IF (BATTERY <= 20) {
        PENUP;  // Dejar de dibujar para ahorrar energía
        WHILE (OBSTACLE = true) {
            LEFT;  // Girar hasta encontrar espacio libre
        }
        PENDOWN;  // Continuar dibujando
    }
}

/* Secuencia de finalización */
PENUP;
RIGHT; RIGHT; RIGHT;  // Orientar hacia el punto de partida
```

Este ejemplo demuestra:
- Comentarios multilínea e inline
- Comandos simples (UP, DOWN, LEFT, RIGHT, PENUP, PENDOWN)
- Estructuras REPEAT anidadas
- Condicionales IF-ELSE anidados
- Bucles WHILE con condiciones complejas
- Operadores lógicos (AND, OR, NOT) con precedencia
- Todos los tipos de sensores (OBSTACLE, DIST, TEMP, LIGHT, BATTERY)
- Operadores de comparación (=, <=, >, etc.)

## 🧪 Cómo Probar tu Implementación

### 1. Generar las clases de ANTLR
```bash
mvn clean antlr4:antlr4
```

### 2. Compilar el proyecto
```bash
mvn compile
```

### 3. Ejecutar las pruebas
```bash
mvn test
```

### 4. Ejecutar prueba específica
```bash
mvn test -Dtest=RoboLangReflectionTest
```

## ✅ Sistema de Evaluación Automática

**Tu calificación se basará en tests automatizados que verifican tu implementación:**

### 📊 Distribución de Puntos (Total: 100 puntos)

| Test | Descripción | Puntos | Requisito |
|------|-------------|---------|-----------|
| 01 | **Archivo de Gramática** | 1 pt | El archivo `RoboLang.g4` debe existir |
| 02 | **Compilación ANTLR** | 4 pts | La gramática debe compilar y generar Lexer/Parser |
| 03 | **Comandos Básicos** | 8 pts | Mínimo 8 tests deben pasar (comandos simples) |
| 04 | **Estructuras REPEAT** | 5 pts | Mínimo 13 tests deben pasar (incluye REPEAT) |
| 05 | **Condicionales IF** | 9 pts | Mínimo 22 tests deben pasar (incluye IF) |
| 06 | **IF-ELSE** | 3 pts | Mínimo 25 tests deben pasar (incluye IF-ELSE) |
| 07 | **Operadores Lógicos** | 12 pts | Mínimo 37 tests deben pasar (AND, OR, NOT) |
| 08 | **Bucles WHILE** | 5 pts | Mínimo 42 tests deben pasar (incluye WHILE) |
| 09 | **Combinaciones Complejas** | 4 pts | Mínimo 46 tests deben pasar (estructuras anidadas) |
| 10 | **Comentarios** | 5 pts | Mínimo 51 tests deben pasar (soporte de comentarios) |
| 11 | **Manejo de Errores** | 44 pts | TODOS los 99 tests deben pasar (válidos e inválidos) |

### 🎯 Para Obtener la Calificación Máxima:

**TODOS los 99 casos de prueba deben pasar:** 54 válidos + 45 inválidos = 99 total

- ✅ **Casos válidos**: Tu gramática debe **aceptar** correctamente
- ❌ **Casos inválidos**: Tu gramática debe **rechazar** correctamente

### 📈 Progresión de la Evaluación:

El sistema evalúa incrementalmente tu gramática:
1. **Tests básicos** (1-10): Verifican características individuales
2. **Test final** (11): Verifica que TODA la gramática funcione perfectamente

**⚠️ Nota Importante:** Si tu gramática no maneja correctamente tanto los casos válidos como los inválidos, no obtendrás los puntos del test final (44 puntos).

## 💡 Tips y Recomendaciones

### Para la Gramática:
- **Empieza simple:** Primero implementa los comandos básicos, luego agrega estructuras complejas
- **Evita ambigüedades:** Usa paréntesis y llaves para delimitar claramente las estructuras
- **Precedencia de operadores:** Implementa correctamente NOT > AND > OR
- **Recursividad:** Usa recursividad para listas de comandos

### Para ANTLR4:
- **Nombres de reglas:** Parser = minúsculas, Lexer = MAYÚSCULAS
- **Orden importa:** Define tokens más específicos antes que los generales
- **Fragmentos:** Usa `fragment` para reglas auxiliares del lexer que no generan tokens
- **Skip:** Usa `-> skip` para ignorar espacios y comentarios

### Para las Pruebas:
- **Casos límite:** Prueba programas vacíos, con un solo comando, muy largos
- **Anidamiento:** Prueba estructuras anidadas (IF dentro de WHILE, etc.)
- **Errores comunes:** Falta de punto y coma, paréntesis desbalanceados, operadores incorrectos

## 🐛 Problemas Comunes y Soluciones

| Problema | Posible Causa | Solución |
|----------|---------------|----------|
| "Token recognition error" | Token no definido en el lexer | Agrega la regla lexer correspondiente |
| "No viable alternative" | Regla del parser incompleta | Revisa que todas las alternativas estén cubiertas |
| "Ambiguous grammar" | Múltiples derivaciones posibles | Usa paréntesis o reestructura las reglas |
| Tests fallan | Gramática no cubre todos los casos | Revisa los casos de prueba fallidos y ajusta la gramática |

## 📊 Casos de Prueba Predefinidos

**⚠️ Los casos de prueba están predefinidos y NO deben modificarse.**

### Análisis de los 99 Casos de Prueba:

**Casos Válidos (54 total)** que tu gramática debe ACEPTAR:
- ✅ Comandos básicos de movimiento y pluma
- ✅ Estructuras REPEAT con diferentes números
- ✅ Condicionales IF simples y con ELSE
- ✅ Bucles WHILE con condiciones complejas
- ✅ Operadores lógicos (AND, OR, NOT) con precedencia correcta
- ✅ Combinaciones y anidamiento de estructuras
- ✅ Comentarios multilínea
- ✅ Programas complejos como navegación de laberintos

**Casos Inválidos (45 total)** que tu gramática debe RECHAZAR:
- ❌ Comandos sin punto y coma
- ❌ Estructuras mal formadas (REPEAT, IF, WHILE incompletos)
- ❌ Paréntesis y llaves desbalanceados
- ❌ Operadores incorrectos (como `==` en lugar de `=`)
- ❌ Comandos inexistentes (como `JUMP`, `FORWARD`)
- ❌ Sintaxis incorrecta en sensores y condiciones
- ❌ Estructuras incompletas o malformadas

### 🔍 Cómo Usar los Casos de Prueba:

1. **Examina los casos válidos** para entender qué debe soportar tu gramática
2. **Estudia los casos inválidos** para saber qué errores debe detectar
3. **Usa los casos como guía** para diseñar tu gramática BNF
4. **Verifica progresivamente** que tu gramática pase más casos conforme la desarrollas


## ⚠️ Notas Importantes

1. **🚫 NO modifiques** el archivo `src/test/resources/RoboLang.yaml` (casos de prueba)
2. **🚫 NO cambies** la estructura de directorios del proyecto
3. **🚫 NO modifiques** los archivos de configuración (pom.xml, GitHub Actions)
4. **✅ SOLO modifica**: `RoboLang.g4` y `GRAMATICA_BNF.md`
5. **✅ Asegúrate** de que tu gramática compile sin errores antes de entregar
6. **✅ Verifica** que pases todos los tests automatizados
7. **✅ Documenta** todas tus decisiones de diseño en el archivo BNF

## 📅 Entrega

- Haz commit y push de todos tus cambios al repositorio
- Asegúrate de que las GitHub Actions pasen correctamente
- Verifica que todos los archivos requeridos estén presentes

---

**¡Éxito con tu implementación!** 🚀

Si tienes dudas, consulta con tu profesor en slack.