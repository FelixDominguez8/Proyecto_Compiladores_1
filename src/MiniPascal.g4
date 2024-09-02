grammar MiniPascal;

COMMENT : '{' .*? '}' -> skip ;
WS : [ \t\r\n]+ -> skip ;
CONSTCHAR : '\'' ~('\'' | '\n' | '\r') '\'' ;
CONSTSTR : '\'' (~('\'' | '\n' | '\r'))* '\'' ;
DOT : '.' ;
VAR : 'var' ;
BEGIN : 'begin' ;
END : 'end' ;
PROGRAM : 'program' ;
WRITE : 'write' ;
READ : 'read' ;
IF : 'if' ;
THEN : 'then' ;
ELSE : 'else' ;
WHILE : 'while' ;
DO : 'do' ;
FOR : 'for' ;
TO : 'to' ;
DOWNTO : 'downto' ;
INTEGER : 'integer' ;
CHAR : 'char' ;
STRING : 'string' ;
BOOLEAN : 'boolean' ;
ARRAY : 'array' ;
OF : 'of' ;
TRUE : 'true' ;
FALSE : 'false' ;
NOT : 'not' ;
AND : 'and' ;
OR : 'or' ;
PLUS : '+' ;
MINUS : '-' ;
MULT : '*' ;
DIV : '/' ;
MOD : 'mod' ;
COLON : ':' ;
SEMICOLON : ';' ;
COMMA : ',' ;
ASSIGN : ':=' ;
LPAREN : '(' ;
RPAREN : ')' ;
LBRACKET : '[' ;
RBRACKET : ']' ;
LT : '<' ;
LE : '<=' ;
GT : '>' ;
GE : '>=' ;
EQ : '=' ;
NEQ : '<>' ;
IDENTIFIER : [a-zA-Z_] [a-zA-Z_0-9]* ;
NUMBER : [0-9]+ ;

// Reglas
program : PROGRAM IDENTIFIER SEMICOLON block '.' ;

block : (varDeclaration)? BEGIN statement* END ;

varDeclaration : VAR varDeclList ;

varDeclList : varDecl (varDecl)* ;

varDecl : IDENTIFIER COLON type SEMICOLON ;

type : INTEGER | CHAR | STRING | BOOLEAN | arrayType ;

arrayType
    : ARRAY LBRACKET arrayDimension (COMMA arrayDimension)* RBRACKET OF (INTEGER | CHAR | BOOLEAN);

arrayDimension
    : NUMBER DOT DOT NUMBER;

statement : assignment | ifStatement | whileStatement | forStatement | writeStatement | readStatement ;

assignment : IDENTIFIER ASSIGN expr SEMICOLON ;

ifStatement : IF expr THEN statement (ELSE statement)? ;

whileStatement : WHILE expr DO statement ;

forStatement : FOR assignment TO expr DO statement ;

writeStatement : WRITE LPAREN (CONSTSTR (COMMA IDENTIFIER)?)? RPAREN SEMICOLON ;

readStatement : READ LPAREN IDENTIFIER RPAREN SEMICOLON ;

expr : term (PLUS term | MINUS term)* ;

term : factor (MULT factor | DIV factor | MOD factor)* ;

factor : IDENTIFIER | NUMBER | LPAREN expr RPAREN | CONSTCHAR | CONSTSTR | TRUE | FALSE ;
