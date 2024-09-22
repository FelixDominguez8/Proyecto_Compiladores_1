program TiposIncorrectos;
var
    var: integer; { Error léxico: 'var' es una palabra reservada y no puede ser usada como nombre de variable }
    entero@2: integer; { Error léxico: '@' es un carácter no permitido en los identificadores }

begin
    var := 100;
    entero@2 := 200;
    writeln('Esto debería fallar debido a los errores léxicos anteriores');
end.
