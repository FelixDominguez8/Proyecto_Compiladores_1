program ScopeConProcedimientoYFuncion;

var
  globalVar: integer; { Variable global, accesible en todos los niveles }

procedure ProcesoEjemplo;
var
  localVar: integer; { Variable local del procedimiento, solo accesible aquí }
begin
  localVar := globalVar + 10;
  writeln('Dentro del procedimiento, localVar = ', localVar);
  writeln('Dentro del procedimiento, globalVar = ', globalVar);
end;

function FuncionEjemplo(x: integer): integer;
var
  localFuncVar: integer; { Variable local de la función, solo accesible aquí }
begin
  localFuncVar := x * 2;
  FuncionEjemplo := localFuncVar; { Asignar valor de retorno a la función }
  writeln('Dentro de la función, localFuncVar = ', localFuncVar);
end;

begin
  { Bloque principal del programa }
  globalVar := 5; { Asignar un valor a la variable global }

  { Llamar al procedimiento }
  ProcesoEjemplo;

  { Llamar a la función y usar su valor de retorno }
  writeln('El resultado de la función es: ', FuncionEjemplo(globalVar));

  { La variable global sigue siendo accesible }
  writeln('En el programa principal, globalVar = ', globalVar);

  { localVar y localFuncVar no son accesibles aquí, ya que están fuera de su alcance (scope) }
end.
