program EjemploCompletoCorrecto;

var
    a, b, resultado: integer;
    texto: string;

function Sumar(x, y: integer): integer;  { Función para sumar dos enteros }
begin
    Sumar := x + y;
end;

procedure MostrarTexto(var str: string);  { Procedimiento que muestra un texto }
begin
    writeln(str);
end;

begin
    a := 10;
    b := 5;

    { Ejemplo de uso de la función }
    resultado := Sumar(a, b);
    writeln('La suma de a y b es: ', resultado);

    { Ejemplo de uso de procedimientos }
    texto := 'Hola, Mini-Pascal!';
    MostrarTexto(texto);

    { Ejemplo de ciclos y condición }
    resultado := 0;
    for a := 1 to 5 do
    begin
        resultado := resultado + a;
    end;
    writeln('Suma con for: ', resultado);

    if resultado = 15 then
        writeln('La suma es 15');

    { Ejemplo de while }
    a := 1;
    while a <= 5 do
    begin
        writeln('Número: ', a);
        a := a + 1;
    end;

    { Ejemplo de repeat }
    a := 1;
    resultado := 0;
    repeat
        resultado := resultado + a;
        a := a + 1;
    until a > 5;

    writeln('Resultado total: ', resultado);
end.
