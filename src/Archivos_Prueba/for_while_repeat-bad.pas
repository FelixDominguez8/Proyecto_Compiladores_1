program EstructurasControlIncorrectas;
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
    for i := 1 to 5 do { Error sintáctico: falta 'begin' }
    begin
        suma := suma + i;  { Error sintáctico: instrucción sin bloque begin...end } {X, talvez podria mejorar la descripcion del error}
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
    if suma = 15 writeln('La suma es 15');  { Error sintáctico: falta 'then' } {X , no dio este error}
    else
        writeln('La suma no es 15');
end.
