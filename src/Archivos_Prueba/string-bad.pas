program StringIncorrecto;
var
    cadenaCorta: string[10];  { String con longitud máxima de 10 caracteres }
    cadenaInvalida: string;

begin
    cadenaCorta := 'Esta cadena es demasiado larga';  { Error sintáctico: longitud excedida } {X deberia marcar este error}
    cadenaInvalida := "Cadena inválida";  { Error léxico: comillas dobles en lugar de comillas simples }

    writeln('Cadena Corta: ', cadenaCorta);
    writeln('Cadena Invalida: ', cadenaInvalida);
end.
