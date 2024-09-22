program ConstantesIncorrectas;
var
    caracter: char;
    cadena: string;

begin
    caracter := "a";  { Error léxico: uso de comillas dobles en lugar de comillas simples }
    cadena := 'Número de cuenta; { Error sintáctico: falta la comilla de cierre en la constante de string } {X}

    writeln('Caracter: ', caracter);
    writeln('Cadena: ', cadena);
end.
