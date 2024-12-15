program ErrorLexico;

var
  num1, num2: integer;

begin
  num1 := 10;
  num2 := 20;

  // Error léxico: el símbolo @ no es válido en Pascal
  writeln('La suma es: ', num1 @ num2);

end.
