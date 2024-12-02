PROGRAM TestSymbolTable;

VAR
    singleArray: ARRAY[1..5] OF INTEGER;         { Arreglo de una dimensión }
    doubleArray: ARRAY[1..3, 1..3] OF INTEGER;   { Arreglo de dos dimensiones }
    i, j: INTEGER;

BEGIN
    { Inicializar el arreglo de una dimensión }
    FOR i := 1 TO 5 DO
        singleArray[i] := i * 2;  { Asigna valores pares }

    { Inicializar el arreglo de dos dimensiones }
    FOR i := 1 TO 3 DO
        FOR j := 1 TO 3 DO
            doubleArray[i, j] := i * j;  { Asigna el producto de los índices }

    { Imprimir el arreglo de una dimensión }
    WRITELN('Arreglo de una dimensión:');
    FOR i := 1 TO 5 DO
        WRITELN('singleArray[', i, '] = ', singleArray[i]);

    { Imprimir el arreglo de dos dimensiones }
    WRITELN('Arreglo de dos dimensiones:');
    FOR i := 1 TO 3 DO
    BEGIN
        FOR j := 1 TO 3 DO
            WRITE(doubleArray[i, j]:4);
        WRITELN;
    END;
END.