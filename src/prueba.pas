program TestAllFeatures;

{ Este es un comentario que ocupa varias líneas.
  Se debe ignorar por el compilador. }

const
  constChar = 'a';  { Constante de carácter }
  constStr = 'Hello, World!';  { Constante de cadena }

var
  intVar: integer;
  charVar: char;
  strVar: string;
  boolVar: boolean;
  intArray: array[1..5] of integer;
  charArray: array[1..5] of char;
  boolArray: array[1..2, 1..2] of boolean;

procedure PrintDetails;
begin
  write('Integer variable: ');
  writeln(intVar);
  write('Char variable: ');
  writeln(charVar);
  write('String variable: ');
  writeln(strVar);
  write('Boolean variable: ');
  writeln(boolVar);
end;

function Factorial(n: integer): integer;
begin
  if n = 0 then
    Factorial := 1
  else
    Factorial := n * Factorial(n - 1);
end;

begin
  { Inicialización de variables }
  intVar := 10;
  charVar := 'b';
  strVar := 'Pascal Example';
  boolVar := true;

  { Operaciones aritméticas }
  intVar := intVar + 5;
  intVar := intVar - 3;

  { Asignación de valores en arrays }
  intArray[1] := 1;
  charArray[1] := 'a';
  boolArray[1, 1] := false;

  { Función factorial }
  writeln('Factorial of 5: ', Factorial(5));

  { Uso de read y write }
  write('Enter an integer: ');
  readln(intVar);
  write('You entered: ', intVar);

  { Uso de funciones }
  writeln('Length of the string: ', length(strVar));

  { Operaciones booleanas }
  if boolVar and (intVar > 10) then
    writeln('Condition met: ', intVar)
  else
    writeln('Condition not met');

  { Estructura de control }
  for intVar := 1 to 5 do
    writeln('For loop iteration: ', intVar);

  while intVar > 0 do
  begin
    writeln('While loop iteration: ', intVar);
    intVar := intVar - 1;
  end;

  repeat
    writeln('Repeat loop iteration: ', intVar);
    intVar := intVar + 1;
  until intVar = 5;

  { Llamada al procedimiento }
  PrintDetails;
end.
