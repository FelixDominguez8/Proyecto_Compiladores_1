program OptimizationsDemo;
var
    x, y, z: integer;
    result: integer;

begin
    x := 5;
    y := 10;
    z := x + y;

    { Operaciones constantes que pueden ser optimizadas }
    result := (10 * 2) + (5 - 3); { Se puede calcular en tiempo de compilación }

    { Redundancia de asignaciones }
    x := x;
    y := z;
    z := y;

    { Uso de constantes en operaciones aritméticas }
    z := z + 0;  { Sumar 0 es redundante }
    result := result * 1; { Multiplicar por 1 es redundante }

    { Ciclo con operaciones invariantes }
    while x < 10 do
    begin
        y := x + 5;  { `+ 5` es invariante y puede moverse fuera del bucle }
        x := x + 1;
    end;

    { Asignaciones y cargas redundantes }
    z := z + y;
    z := z + y;  { Redundante, se repite innecesariamente }

    writeln('Resultado: ', result);
end.
