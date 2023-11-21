package com.eventos.servicio;

import com.eventos.domain.Area;
import java.util.List;

public interface AreaService {

    public List<Area> listar();

    public void guardar(Area area);

    public void eliminar(Area area);

    public Area encontrarArea(Area area);
}
