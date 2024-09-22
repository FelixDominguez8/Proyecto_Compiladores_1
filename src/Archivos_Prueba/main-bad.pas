program ProcedimientosAnidadosIncorrectos;

procedure Saludar;
begin
    writeln('¡Hola desde el procedimiento Saludar!');
end;

procedure EjecutarSaludo;
    Saludar;  { Error sintáctico: falta el bloque 'begin' para el procedimiento }
end;

begin
    writeln('Cuerpo principal del programa');
    EjecutarSaludo;  { Esto provocará un error por la definición anterior }
end.
