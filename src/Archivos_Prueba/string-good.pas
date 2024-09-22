program StringCorrecto;
var
    cadenaCorta: string[20];  { String con longitud máxima de 20 caracteres }
    cadenaLarga: string;      { String con longitud por defecto (hasta 255 caracteres) }

begin
    cadenaCorta := 'Hola Mundo';  { Cadena válida }
    cadenaLarga := 'Esta es una cadena con más de 20 caracteres, pero está bien porque no supera los 255.';

    writeln('Cadena Corta: ', cadenaCorta);
    writeln('Cadena Larga: ', cadenaLarga);
end.
