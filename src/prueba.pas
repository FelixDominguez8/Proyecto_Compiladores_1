program WhileRepeatExample;

var
    num, sum, count: INTEGER;

begin
    sum := 0;
    count := 1;

    while count <= 5 do
    begin
        sum := sum + count;
        count := count + 1;
    end;

    WRITELN('Suma de los números del 1 al 5 usando while: ', sum);

    sum := 0;
    num := 1;

    repeat
        sum := sum + num;
        num := num + 1;
    until num > 5;

    WRITELN('Suma de los números del 1 al 5 usando repeat: ', sum);

    if (sum mod 2 = 0) then
        WRITELN('La suma total es un número par.');
    else
        WRITELN('La suma total es un número impar.');
end.
