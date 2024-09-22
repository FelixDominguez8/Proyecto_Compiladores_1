program IfConBegin;

var
  n: integer;

begin
  writeln('Ingrese un número:');
  readln(n);

  { Evaluación de la expresión booleana con IF y BEGIN }
  if n > 10 then
  begin
    writeln('El número es mayor que 10');
    writeln('Este es un bloque con más de una instrucción.');
  end
  else if n = 10 then
  begin
    writeln('El número es igual a 10');
    writeln('Este es otro bloque con múltiples instrucciones.');
  end
  else
  begin
    writeln('El número es menor que 10');
    writeln('Este es un bloque else con varias instrucciones.');
  end;
end.
