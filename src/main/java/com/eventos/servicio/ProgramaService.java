
package com.eventos.servicio;

import com.eventos.domain.Programa;

import java.util.List;


public interface ProgramaService {

    public List<Programa> listar();

    public void guardar(Programa programa);

    public void eliminar(Programa programa);

    public Programa encontrarArea(Programa programa);
}
