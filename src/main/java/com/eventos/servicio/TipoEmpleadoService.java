package com.eventos.servicio;

import com.eventos.domain.TipoEmpleado;
import java.util.List;

public interface TipoEmpleadoService {
    public List<TipoEmpleado> listar();

    public void guardar(TipoEmpleado tipoEmpleado);

    public void eliminar(TipoEmpleado tipoEmpleado);

    public TipoEmpleado encontrarArea(TipoEmpleado tipoEmpleado);
}
