program IOFuncionesIncorrecto;
var
    entero: integer;
    booleano: boolean;
    cadena: string;

begin
    write('Introduce un número entero: ');
    read(entero);  { Lectura correcta de un entero }

    write('Introduce un valor booleano: ');
    read(booleano);  { Error léxico: no se puede leer un valor de tipo boolean }

    write('Introduce una cadena: ');
    read(cadena);  { Lectura correcta de una cadena }

    writeln;  { Error sintáctico: falta un parámetro en write o writeln }
    writeln(entero, cadena);  { Error sintáctico: writeln solo puede recibir un string y una variable }
end.

{No da error de nada}