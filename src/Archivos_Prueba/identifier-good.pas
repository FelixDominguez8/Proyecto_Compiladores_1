program IdentificadoresCorrectos;
var
    variable1: integer;  { Identificador válido }
    _variable: integer;   { Identificador válido que comienza con un guion bajo }
    numero2: integer;     { Identificador válido }

begin
    variable1 := 10;
    _variable := 20;
    numero2 := 5;

    writeln('Variable 1: ', variable1);
    writeln('_Variable: ', _variable);
    writeln('Número 2: ', numero2);
end.
