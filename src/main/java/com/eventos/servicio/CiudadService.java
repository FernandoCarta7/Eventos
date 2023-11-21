/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.eventos.servicio;

import com.eventos.domain.Ciudad;
import java.util.List;

/**
 *
 * @author carta
 */
public interface CiudadService {
    public List<Ciudad> listar();

    public void guardar(Ciudad ciudad);

    public void eliminar(Ciudad ciudad);

    public Ciudad encontrarArea(Ciudad ciudad);
}
