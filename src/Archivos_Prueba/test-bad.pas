program EjemploCompletoIncorrecto;

var
    a, b: integer;
    resultado: integer;

function Sumar(x, y: entero): integer;  { Error léxico: 'entero' no está definido }
begin
    Sumar := x + y;
end;

procedure MostrarTexto(var str: string);  { Procedimiento correcto }
begin
    writeln(str);
end;

begin
    a := 10;
    b := 5;

    resultado := Sumar(a, b);
    writeln('La suma de a y b es: ', resultado);

    if resultado = 15
        writeln('La suma es 15');  { Error sintáctico: falta 'then' }

    { Error sintáctico: falta 'begin' en el ciclo for }
    for a := 1 to 5
        resultado := resultado + a;  { Error sintáctico: instrucción sin bloque begin...end }
    end;

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
