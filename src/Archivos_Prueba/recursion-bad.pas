program RecursividadIncorrecta;
var
    numero: integer;

function Factorial(n: entero): integer;  { Error léxico: 'entero' no está definido como tipo }
begin
    if n = 0 then
        Factorial := 1
    else
        Factorial := n * Factorial(n - 1);
end;

begin
    numero := 5;
    writeln('El factorial de ', numero, ' es: ', Factorial(numero));  { Esto provocará un error por la definición anterior }
end.
