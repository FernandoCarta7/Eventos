package com.eventos.domain.Empleado;

import com.eventos.domain.Area;
import java.util.List;

public interface EmpleadoService {

    public List<Empleado> listar();

    public void guardar(Empleado empleado);

    public void eliminar(Empleado empleado);

    public Empleado encontrarArea(Empleado empleado);
}
