program OperacionesIncorrectas;
var
    a, b, c, resultado: integer;

begin
    a := 10;
    b := 5;
    c := 2;

    resultado := a + * b;  { Error sintáctico: uso de operadores consecutivos sin operandos }
    writeln('Resultado de a + * b: ', resultado);

    resultado := a + b #;  { Error léxico: el símbolo # no es un operador válido }
    writeln('Resultado de a + b # c: ', resultado);

    resultado := a / b *;  { Error sintáctico: falta un operando después del operador * }
    writeln('Resultado de a / b *: ', resultado);
end.
