PROGRAM TestFunctions;
VAR
    result: INTEGER;

FUNCTION Add(a, b: INTEGER): BOOLEAN;
BEGIN
    Add := a + b;
END;

BEGIN
    result := Add(5, 3);
    WRITE('The result is: ', result);
END.