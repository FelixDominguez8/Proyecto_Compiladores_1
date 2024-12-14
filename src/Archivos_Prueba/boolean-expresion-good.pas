program ScopeConProcedimientoYFuncion;

var
  globalVar: integer;
procedure ProcesoEjemplo;
var
  localVar: integer;
begin
  localVar := globalVar + 10;
  writeln('Dentro del procedimiento, localVar = ', localVar);
  writeln('Dentro del procedimiento, globalVar = ', globalVar);
end;

function FuncionEjemplo(x: integer): integer;
var
  localFuncVar: integer;
begin
  localFuncVar := x * 2;
  FuncionEjemplo := localFuncVar;
  writeln('Dentro de la función, localFuncVar = ', localFuncVar);
end;

begin
  globalVar := 5;
  ProcesoEjemplo;
  writeln('El resultado de la función es: ', FuncionEjemplo(globalVar));
  writeln('En el programa principal, globalVar = ', globalVar);

end.
