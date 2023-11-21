package com.eventos.servicio;

import com.eventos.domain.Pais;
import java.util.List;

public interface PaisService {
    
    public List<Pais> listar();

    public void guardar(Pais pais);

    public void eliminar(Pais pais);

    public Pais encontrarArea(Pais pais);
}
