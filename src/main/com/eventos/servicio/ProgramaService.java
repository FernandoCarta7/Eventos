
package com.eventos.domain.Programa;
import com.eventos.domain.Area;
import java.util.List;


public interface ProgramaService {

    public List<Programa> listar();

    public void guardar(Programa programa);

    public void eliminar(Programa programa);

    public Programa encontrarArea(Programa programa);
}
