program IOFuncionesCorrecto;
var
    entero: integer;
    caracter: char;
    cadena: string;

begin
    write('Introduce un número entero: ');
    read(entero);  { Lectura correcta de un entero }

    write('Introduce un carácter: ');
    read(caracter);  { Lectura correcta de un carácter }

    write('Introduce una cadena: ');
    read(cadena);  { Lectura correcta de una cadena }

    writeln('Número ingresado: ', entero);  { Escritura correcta con dos parámetros }
    writeln('Carácter ingresado: ', caracter);  { Escritura correcta con dos parámetros }
    writeln('Cadena ingresada: ', cadena);  { Escritura correcta con dos parámetros }
end.
