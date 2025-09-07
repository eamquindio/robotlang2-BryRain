grammar RoboLang;

// ===== PARSER RULES (minúscula) =====

program : lista_sentencia EOF ;

lista_sentencia
    :(sentencia)*
    ;
sentencia
    :sentencia_comando | sentencia_repeat | sentencia_if | sentencia_while;

sentencia_comando
    :comando_simple ';'
    ;

comando_simple
    :UP | DOWN | PENUP | PENDOWN | LEFT | RIGHT
    ;

sentencia_repeat
    :REPEAT ENTERO '{' lista_sentencia '}'
    ;

sentencia_if
    : IF '(' expresion ')' '{' lista_sentencia '}' else_condicion
    ;

else_condicion
    :// vacio
    |ELSE '{' lista_sentencia '}'
    ;

sentencia_while
    : WHILE '(' expresion ')' '{' lista_sentencia '}'
    ;

expresion
    : expresion_or
    ;

expresion_or
    : expresion_and ('OR' expresion_and)*
    ;

expresion_and
    : expresion_not ('AND' expresion_not)*
    ;

expresion_not
    : 'NOT' expresion_not
    | expresion_comparador
    ;

expresion_comparador
    : '(' expresion ')'
    | sensor_numerico comp_op ENTERO
    | sensor_booleano comp_op booleano
    | booleano
    ;

sensor_numerico
    : 'DIST'| 'TEMP'| 'BATTERY' |'LIGHT';

sensor_booleano
    : 'OBSTACLE'
    ;

comp_op
    : '=' | '!=' | '<' | '<=' | '>' | '>=';

valor
    : ENTERO
    | booleano
    ;

booleano
    : 'true'
    | 'false'
    ;


// ===== LEXER RULES (MAYÚSCULA) =====
//Los tokens

UP: 'UP';
DOWN : 'DOWN' ;
PENUP:'PENUP';
PENDOWN: 'PENDOWN';
LEFT: 'LEFT';
RIGHT: 'RIGHT';

REPEAT   : 'REPEAT' ;
IF       : 'IF' ;
ELSE     : 'ELSE' ;
WHILE    : 'WHILE' ;


ENTERO : [0-9]+ ;

// Manejo de espacios y comentarios¿
WS           : [ \t\r\n]+ -> skip ;
COMENTARIO   : '/*' .*? '*/' -> skip ;
LINEA_COMENT : '//' ~[\r\n]* -> skip ;


