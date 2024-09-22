program RecursividadCorrecta;
var
    numero: integer;

function Factorial(n: integer): integer;  { Función recursiva para calcular el factorial }
begin
    if n = 0 then
        Factorial := 1  { Caso base }
    else
        Factorial := n * Factorial(n - 1);  { Llamada recursiva }
end;

begin
    numero := 5;
    writeln('El factorial de ', numero, ' es: ', Factorial(numero));
end.
