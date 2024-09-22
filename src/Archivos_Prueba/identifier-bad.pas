program IdentificadoresIncorrectos;
var
    1variable: integer;  { Error léxico: identificador no puede comenzar con un dígito }
    variable-2: integer;  { Error léxico: el guion medio no es un carácter válido en identificadores }

begin
    1variable := 20;  { Esta línea no será alcanzada debido al error anterior }
    variable-2 := 30;  { Esta línea no será alcanzada debido al error anterior }

    writeln('1variable: ', 1variable);
    writeln('variable-2: ', variable-2);
end.
