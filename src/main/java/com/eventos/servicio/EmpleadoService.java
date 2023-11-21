package com.eventos.servicio;
import com.eventos.domain.Empleado;

import java.util.List;

public interface EmpleadoService {

    public List<Empleado> listar();

    public void guardar(Empleado empleado);

    public void eliminar(Empleado empleado);

    public Empleado encontrarArea(Empleado empleado);
}
