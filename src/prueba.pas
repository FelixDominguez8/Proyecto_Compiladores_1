program CiclosYCondicionales;

var
  i, n, suma: integer;

begin
  writeln('Ingrese un número para la suma de los primeros N números:');
  readln(n);

  suma := 0;

  { Ciclo while }
  i := 1;
  while i <= n do
  begin
    suma := suma + i;
    i := i + 1;
  end;
  writeln('Suma usando while: ', suma);

  { Ciclo for }
  suma := 0;
  for i := 1 to n do
    suma := suma + i;
  writeln('Suma usando for: ', suma);

  { Ciclo repeat-until }
  suma := 0;
  i := 1;
  repeat
    suma := suma + i;
    i := i + 1;
  until i > n;
  writeln('Suma usando repeat-until: ', suma);

  { Instrucción if }
  if suma mod 2 = 0 then
    writeln('La suma es un número par')
  else
    writeln('La suma es un número impar');
end.
