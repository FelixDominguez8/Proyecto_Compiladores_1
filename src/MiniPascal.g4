grammar MiniPascal;

options {
    caseInsensitive = true;
}

//Tokens
PROGRAM : 'program' ;
FUNCTION : 'function' ;
LENGTH : 'length' ;
PROCEDURE : 'procedure' ;
BEGIN : 'begin' ;
END : 'end' ;
CONST : 'const' ;
VAR : 'var' ;
ARRAY : 'array' ;
TO : 'to' ;
CHAR : 'char' ;
BOOLEAN : 'boolean' ;
INTEGER : 'integer' ;
OF : 'of' ;
STRING : 'string' ;
TYPE : 'type' ;
IF : 'if' ;
ELSE : 'else' ;
DO : 'do' ;
FOR : 'for' ;
DOWNTO : 'downto' ;
REPEAT : 'repeat' ;
THEN : 'then' ;
UNTIL : 'until' ;
WHILE : 'while' ;
PLUS : '+' ;
MINUS : '-' ;
MULTIPLY : '*' ;
DIVIDE : '/' ;
MOD : 'mod' ;
DIV : 'div' ;
AND : 'and' ;
NOT : 'not' ;
OR : 'or' ;
TRUE : 'true' ;
FALSE : 'false' ;
EQUAL : '=' ;
NOTEQUAL : '<>' ;
LESSTHEN : '<' ;
LESSEQUAL : '<=' ;
GREATEQUAL : '>=' ;
GREATTHEN : '>' ;
ASSIGN : ':=' ;
COMMA : ',' ;
SEMICOLON : ';' ;
COLON : ':' ;
PARL : '(' ;
PARR : ')' ;
LBRACKET : '[' ;
LBRACKETP : '(.' ;
RBRACKET : ']' ;
RBRACKETP : '.)' ;
DOT : '.' ;
DOT2 : '..' ;
SPACE : [ \t\r\n] -> skip ;
COMMENT : '{' .*? '}' -> skip ;
LSTRING : '\'' ('\'\'' | ~ ('\''))* '\'' ;
NUM : ('0' .. '9')+ ;
IDENTIFIER : ('A' .. 'Z') ('A' .. 'Z' | '0' .. '9' | '_')* ;

//Reglas
programa : encabezado bloque DOT EOF ;
encabezado : PROGRAM IDENTIFIER (PARL listaidentificadores PARR)? SEMICOLON;
bloque : ( constantDefinitionPart | secciondefiniciontipo | variableDeclarationPart | secciondeclaracionprocesoofuncion)* bloqueinstruccion ;
length : LENGTH PARL variable PARR ;
instruccion : NUM COLON tipoinstruccion | tipoinstruccion ;
tipoinstruccion : instruccionsimple | instruccionestructurada ;
instruccionsimple : instruccionasignacion | instruccionprocedimiento | instruccionvacia ;
instruccionestructurada : bloqueinstruccion | estructuraif | estructurarepetitiva;
instruccionasignacion : variable ASSIGN expresion ;
bloqueinstruccion : BEGIN instrucciones END ;
estructurarepetitiva : buclewhile | buclerepeat | buclefor ;
instrucciones : instruccion (SEMICOLON instruccion)* ;
buclerepeat : REPEAT instrucciones UNTIL expresion ;
buclewhile : WHILE expresion DO instruccion ;
estructuraif : IF expresion THEN instruccion (: ELSE instruccion)? ;
buclefor : FOR IDENTIFIER ASSIGN listafor DO instruccion ;
listafor : expresion (TO | DOWNTO) expresion ;
tipo : tiposimple | tipoarreglo;
tipolista : tiposimple (COMMA tiposimple)* ;
tipoidentificador : IDENTIFIER | (CHAR | BOOLEAN | INTEGER | STRING) ;
definiciontipo : IDENTIFIER EQUAL (tipo | tipofuncion | tipoproceso) ;
secciondefiniciontipo : TYPE (definiciontipo SEMICOLON)+ ;
tipofuncion : FUNCTION (listaformalparametros)? COLON tipoidentificador ;
tipoproceso : PROCEDURE (listaformalparametros)? ;
tipoarreglo : ARRAY LBRACKET tipolista RBRACKET OF tipo | ARRAY LBRACKETP tipolista RBRACKETP OF tipo ;
tipocadena : STRING LBRACKET (IDENTIFIER | NUM) RBRACKET ;
tiposimple : tipoescalar | tiposubrango | tipoidentificador | tipocadena ;
tipoescalar : PARL listaidentificadores PARR ;
tiposubrango : constante DOT2 constante ;
signo : PLUS | MINUS ;
valorbooleano : TRUE | FALSE ;
constante : NUM | signo NUM | IDENTIFIER | signo IDENTIFIER | LSTRING | length ;
declaracionvariable : listaidentificadores COLON tipo ;
variableDeclarationPart : VAR declaracionvariable (SEMICOLON declaracionvariable)* SEMICOLON ;
definicionconstante : IDENTIFIER EQUAL constante ;
constantDefinitionPart : CONST (definicionconstante SEMICOLON)+ ;
procedureDeclaration : PROCEDURE IDENTIFIER (listaformalparametros)? SEMICOLON bloque ;
declaracionprocesoofuncion : procedureDeclaration | declaracionfuncion ;
secciondeclaracionprocesoofuncion : declaracionprocesoofuncion SEMICOLON ;
listaparametros : parametroactual (COMMA parametroactual)* ;
grupoparametros : listaidentificadores COLON tipoidentificador ;
parametroactual : expresion anchoparametro* ;
anchoparametro : COLON expresion ;
listaformalparametros : PARL seccionformalparametros (SEMICOLON seccionformalparametros)* PARR ;
seccionformalparametros : grupoparametros | VAR grupoparametros | FUNCTION grupoparametros | PROCEDURE grupoparametros ;
listaidentificadores : IDENTIFIER (COMMA IDENTIFIER)* ;
declaracionfuncion : FUNCTION IDENTIFIER (listaformalparametros)? COLON tipoidentificador SEMICOLON bloque ;
designarfuncion : IDENTIFIER PARL listaparametros PARR ;
instruccionprocedimiento : IDENTIFIER (PARL listaparametros PARR)? ;
variable : IDENTIFIER ( LBRACKET expresion (COMMA expresion)* RBRACKET | LBRACKETP expresion (COMMA expresion)* RBRACKETP | DOT IDENTIFIER)* ;
expresionsimple : termino (operadoraditivo expresionsimple)? ;
expresion : expresionsimple (operadorrelacional expresion)? ;
operadorrelacional : EQUAL | NOTEQUAL | LESSTHEN | LESSEQUAL | GREATEQUAL | GREATTHEN ;
operadormultiplicativo : MULTIPLY | DIVIDE | DIV | MOD | AND ;
operadoraditivo : PLUS | MINUS | OR ;
termino : signofactor (operadormultiplicativo termino)? ;
signofactor : (PLUS | MINUS)? factor ;
factor : variable | PARL expresion PARR | designarfuncion | constante | NOT factor | valorbooleano ;
instruccionvacia : ;
vacio : /* nada */ ;