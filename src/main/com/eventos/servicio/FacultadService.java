package com.eventos.domain.Facultad;

import com.eventos.domain.Facultad;
import java.util.List;

public interface FacultadService {

    public List<Facultad> listar();

    public void guardar(Facultad facultad);

    public void eliminar(Facultad facultad);

    public Facultad encontrarArea(Facultad facultad);
}
