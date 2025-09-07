# Gramática BNF de RoboLang

## Definición Formal de la Gramática

G = (V,Σ,S,P)

### Símbolos No Terminales
- `<programa>`: Programa completo
- `<lista_sentencia>`: Secuencia de sentencias
- `<sentencia>`: Unidad de instruccion
- `<sentencia_comando>`: sentencia de comando simple
- `<comando_simple>`: intruccion basica de movimiento
- `<sentencia_repeat>`: sentencia de repeticion
- `<sentencia_if>`: sentencia condicional
- `<else_condicion>`: Rama opcional de IF 
- `<sentencia_while>`: Bucle que ejecuta varias veces minestra sea true
- `<expresion>`: expresion logica formada por operador, comparador o boolean
- `<expresion_or>`: Subexpresion logica del operador OR
- `<expresion_and>`: Subexpresion logica del operador AND
- `<expresion_not>`: Subexpresion logica del operador NOT 
- `<expresion_comparador>`: Expresion base que puede ser una comparacion de sensor
- `<sensor_numerico>`: lectura de sensor numérico (DIST, TEMP, BATTERY, LIGHT)
- `<sensor>`: Representa la lectura del entorno de robot
- `<valor>`: puede ser un numero entero o booleanno
- `<comp_op>`: Operador de comparacion como =, !=, <,>.<=,>=
- ...

### Símbolos Terminales
- Comandos de movimiento: `UP`, `DOWN`, `LEFT`, `RIGHT`, `PENUP`, `PENDOWN`, `REPEAT`, `IF`, `ELSE`, `WHILE`, `DIST`,
- ,`ELSE`, `WHILE`, `DIST`, `TEMP`, `BATTERY`, `OBSTACLE`, `=`, `!=`, `<`, `>`, `>=`, `<=`, `,`
- , `NOT`, `AND`, `OR`, `true`, `false`, `;`, `,`, `{`, `}`, `(`, `)`, `INT`
-
## Simbolo Inicial
-S: `<program>`

## Reglas de Producción
## Gramática en BNF

```bnf

<programa> ::= <lista_sentencia>

<lista_sentencia> ::= ε
                   | <sentencia> <lista_sentencia>

<sentencia> ::= <sentencia_comando>
              | <sentencia_repeat>
              | <sentencia_if>
              | <sentencia_while>

<sentencia_comando> ::= <comando_simple> ';'

<comando_simple> ::= UP
                   | DOWN
                   | LEFT
                   | RIGHT
                   | PENUP
                   | PENDOWN

<sentencia_repeat> ::= REPEAT INT '{' <lista_sentencia> '}'

<sentencia_if> ::= IF '(' <expresion> ')' '{' <lista_sentencia> '}' <else_condicion>

<else_condicion> ::= ε
                   | ELSE '{' <lista_sentencia> '}'

<sentencia_while> ::= WHILE '(' <expresion> ')' '{' <lista_sentencia> '}'

/* Expresiones booleanas con precedencia: NOT > AND > OR */
<expresion> ::= <expresion_or>

<expresion_or> ::= <expresion_and>
                 | <expresion_or> OR <expresion_and>

<expresion_and> ::= <expresion_not>
                  | <expresion_and> AND <expresion_not>

<expresion_not> ::= NOT <expresion_not>
                  | <expresion_comparador>

<expresion_comparador> ::= '(' <expresion> ')'
                        | <sensor> <comp_op> <valor>
                        | <booleano>

<sensor> ::= DIST
           | TEMP
           | BATTERY
           | OBSTACLE

<comp_op> ::= '='
            | '!='
            | '<'
            | '<='
            | '>'
            | '>='

<valor> ::= INT
          | <booleano>

<booleano> ::= true
            | false

```
## Precedencia de Operadores
- NOT: tiene mayor precedencia
- AND: tiene precedencia media
- OR: tiene menor precedencia
-un ejempplo de esta precedencia es: NOT true and false or true

## Justificación de Diseño
- Se usa la expresion or, and y not para reflejar mejor la precedencia entre estos
- se usa la regla de valor para usar mas facil el uso de variables y constantes 
- use la sentenci sensor numerico y booleano para permitir entender mejor las comparaciones numericas y booleanas
- se uso la sentencia que agrupa otras formas de intruccion como los comandos, el repeat. esto permite distinguir las acciones
- simples y las estructuras.
- la regla de else_condicion permite que el else sea opcional
- se usa parentesis para darle mejorar la flexibilidad al escribir la precedencia cuando se necesite