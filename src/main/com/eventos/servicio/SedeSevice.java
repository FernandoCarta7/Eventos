package com.eventos.domain.Sede;

import com.eventos.domain.Facultad;
import java.util.List;

public interface SedeService {
    public List<Facultad> listar();

    public void guardar(Sede sede);

    public void eliminar(Sede sede);

    public Facultad encontrarArea(Sede sede);
}
