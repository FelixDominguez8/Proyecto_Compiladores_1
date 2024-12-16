PROGRAM ScopeErrorTest;
VAR
    globalResult: INTEGER;

FUNCTION Multiply(x, y: INTEGER): INTEGER;
VAR
    localVar: INTEGER;
BEGIN
    localVar := x * y;
    Multiply := localVar;
END;

BEGIN
    globalResult := Multiply(4, 2);
    WRITE('The result of multiplication is: ', globalResult);

    { Error de scope: Intento de acceder a una variable local de la función }
    WRITE('Trying to access localVar outside its scope: ', localVar);
END.
