program OperacionesCorrectas;
var
    a, b, c, resultado: integer;

begin
    a := 10;
    b := 5;
    c := 2;

    { Las operaciones siguen la precedencia de operadores:
      1. Paréntesis
      2. Multiplicación y división
      3. Suma y resta }

    resultado := a + b * c;  { Resultado será 10 + (5 * 2) = 20 }
    writeln('Resultado de a + b * c: ', resultado);

    resultado := (a + b) * c;  { Resultado será (10 + 5) * 2 = 30 }
    writeln('Resultado de (a + b) * c: ', resultado);

    resultado := a + b - c * 2;  { Resultado será 10 + 5 - (2 * 2) = 11 }
    writeln('Resultado de a + b - c * 2: ', resultado);

    resultado := a div b + c;  { Resultado será (10 div 5) + 2 = 2 + 2 = 4 }
    writeln('Resultado de a div b + c: ', resultado);
end.
