program ExpresionesBooleanasCorrectas;
var
    a, b: integer;
    resultado: boolean;

begin
    a := 10;
    b := 5;

    { Precedencia lógica:
      1. not
      2. and
      3. or
      4. Comparadores (<, >, =, <>, <=, >=) }

    resultado := (a > b) and (b < a);  { Resultado es true porque (10 > 5) and (5 < 10) }
    writeln('Resultado de (a > b) and (b < a): ', resultado);

    resultado := (a = 10) or (b = 20);  { Resultado es true porque (a = 10) es true }
    writeln('Resultado de (a = 10) or (b = 20): ', resultado);

    resultado := not (a = b);  { Resultado es true porque (a = b) es false }
    writeln('Resultado de not (a = b): ', resultado);

    resultado := (a >= b) and (b <= a) or (a <> b);  { Operadores lógicos combinados }
    writeln('Resultado de expresión combinada: ', resultado);
end.
