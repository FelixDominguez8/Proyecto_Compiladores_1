program EstructurasControlCorrectas;
var
    i: integer;
    suma: integer;

begin
    suma := 0;

    { Ciclo while }
    i := 1;
    while i <= 5 do
    begin
        suma := suma + i;
        i := i + 1;
    end;

    writeln('Suma con while: ', suma);

    { Ciclo for }
    suma := 0;  { Reiniciar suma }
    for i := 1 to 5 do
    begin
        suma := suma + i;
    end;

    writeln('Suma con for: ', suma);

    { Ciclo repeat }
    suma := 0;  { Reiniciar suma }
    i := 1;
    repeat
        suma := suma + i;
        i := i + 1;
    until i > 5;

    writeln('Suma con repeat: ', suma);

    { Instrucción if }
    if suma = 15 then
        writeln('La suma es 15')
    else
        writeln('La suma no es 15');
end.
