program TiposCorrectos;
var
    entero: integer;
    caracter: char;
    cadena: string;
    booleano: boolean;
    arregloEnteros: array[1..3, 1..3] of integer; { Arreglo bidimensional de enteros }
    arregloBooleanos: array[1..2, 1..2] of boolean; { Arreglo bidimensional de booleanos }
    arregloCaracteres: array[1..2] of char; { Arreglo unidimensional de caracteres }

begin
    { Asignaciones correctas }
    entero := 100;
    caracter := 'A';
    cadena := 'Hola Mundo';
    booleano := true;

    { Asignación a un arreglo bidimensional }
    arregloEnteros[1, 1] := 10;
    arregloEnteros[2, 2] := 20;

    arregloBooleanos[1, 1] := true;
    arregloBooleanos[2, 2] := false;

    arregloCaracteres[1] := 'X';
    arregloCaracteres[2] := 'Y';

    { Imprimir algunos valores }
    writeln('Entero: ', entero);
    writeln('Caracter: ', caracter);
    writeln('Cadena: ', cadena);
    writeln('Booleano: ', booleano);
    writeln('Elemento en arregloEnteros[1,1]: ', arregloEnteros[1,1]);
    writeln('Elemento en arregloBooleanos[1,1]: ', arregloBooleanos[1,1]);
    writeln('Elemento en arregloCaracteres[1]: ', arregloCaracteres[1]);
end.
