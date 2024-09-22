program FuncionesCorrectas;
var
    resultado: integer;

function Sumar(a, b: integer): integer;  { Función que recibe parámetros por valor }
begin
    Sumar := a + b;  { Retorna la suma de a y b }
end;

procedure Duplicar(var valor: integer);  { Procedimiento que recibe un parámetro por referencia }
begin
    valor := valor * 2;  { Duplicar el valor de la variable }
end;

begin
    resultado := Sumar(10, 5);  { Llama a la función Sumar }
    writeln('Resultado de la suma: ', resultado);

    Duplicar(resultado);  { Llama al procedimiento Duplicar }
    writeln('Resultado duplicado: ', resultado);
end.
