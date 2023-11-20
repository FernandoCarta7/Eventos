package com.eventos.domain.Pais;

import com.eventos.domain.Area;
import java.util.List;

public interface PaisService {
    
    public List<Empleado> listar();

    public void guardar(Empleado empleado);

    public void eliminar(Empleado empleado);

    public Empleado encontrarArea(Empleado empleado);
}
