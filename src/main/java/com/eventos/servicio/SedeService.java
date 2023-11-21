package com.eventos.servicio;

import com.eventos.domain.Sede;
import java.util.List;

public interface SedeService {
    public List<Sede> listar();

    public void guardar(Sede sede);

    public void eliminar(Sede sede);

    public Sede encontrarArea(Sede sede);
}
