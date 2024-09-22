program ProcedimientosAnidadosCorrectos;

procedure Saludar();
begin
    writeln('¡Hola desde el procedimiento Saludar!');
end;

procedure EjecutarSaludo();
begin
    Saludar;  { Llama al procedimiento anidado }
end;

begin
    writeln('Cuerpo principal del programa');
    EjecutarSaludo;  { Llama al procedimiento que a su vez llama a Saludar }
end.
