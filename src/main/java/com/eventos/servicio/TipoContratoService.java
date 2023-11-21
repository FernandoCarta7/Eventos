package com.eventos.servicio;

import com.eventos.domain.TipoContrato;
import java.util.List;

public interface TipoContratoService {
    public List<TipoContrato> listar();

    public void guardar(TipoContrato tipoContrato);

    public void eliminar(TipoContrato tipoContrato);

    public TipoContrato encontrarArea(TipoContrato tipoContrato);
}
