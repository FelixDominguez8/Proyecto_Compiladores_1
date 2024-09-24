program StringIncorrecto;
var
    cadena1: string;
    cadena2: string;

begin
    cadena1 := 'cadena';
    cadena2 := "Cadena";  { Error léxico: comillas dobles en lugar de comillas simples }

    writeln('Cadena: ', cadenaCorta);
end.
