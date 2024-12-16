program InvalidIfCondition;
var
  x: INTEGER;
  y: BOOLEAN;
begin
  x := 10;
  y := true;

  { Error: Comparando un entero con un boolean }
  if x > y then
    write('x is greater than y')
  else
    write('x is not greater than y');
end.