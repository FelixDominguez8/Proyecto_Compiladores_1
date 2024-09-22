program ExpresionesBooleanasIncorrectas;
var
    a, b: integer;
    resultado: boolean;

begin
    a := 10;
    b := 5;

    resultado := (a > b) and or (b < a);  { Error sintáctico: uso incorrecto de "and or" consecutivos }
    writeln('Resultado de expresión con and or: ', resultado);

    resultado := a =< b;  { Error léxico: el operador =< no existe, debería ser <= }
    writeln('Resultado de a =< b: ', resultado);

    resultado := (a > b) & (b < a);  { Error léxico: el símbolo & no es un operador lógico en Pascal }
    writeln('Resultado de expresión con & en lugar de and: ', resultado);
end.
