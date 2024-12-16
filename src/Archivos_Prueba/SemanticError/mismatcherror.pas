PROGRAM MismatchExample;
VAR
    a: INTEGER;
    b: BOOLEAN;

BEGIN
    a := 10;
    b := TRUE;

    IF (a = b) THEN
        WRITE('This comparison should fail.');
END.
