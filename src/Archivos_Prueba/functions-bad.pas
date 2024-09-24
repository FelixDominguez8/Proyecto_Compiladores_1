program FuncionesIncorrectas;
var
    resultado: integer;

function Sumar(a, b: integer): integer;  { Función correcta }
begin
    Sumar := a + b;  { Retorna la suma de a y b }
end;

procedure Duplicar(var valor: entero);  { Error léxico: 'entero' no está definido como tipo }
begin
    valor := valor * 2;
end;

begin
    resultado := Sumar(10, 5);
    writeln('Resultado de la suma: ', resultado);

    Duplicar(resultado);
    writeln('Resultado duplicado: ', resultado);
end.
