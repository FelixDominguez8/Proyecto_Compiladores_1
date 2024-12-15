program PrintArray;

var
    numbers: array [1..5] of integer;
    i: boolean; { Error semántico: i debería ser integer, no boolean }

begin
    { Initialize the array }
    numbers[1] := 1;
    numbers[2] := 2;
    numbers[3] := 3;
    numbers[4] := 4;
    numbers[5] := 5;

    { Error semántico: usar boolean como si fuera un integer }
    for i := 1 to 5 do
        write(numbers[i], ' ');

    writeln;
end.{esto es un comment modificado}
