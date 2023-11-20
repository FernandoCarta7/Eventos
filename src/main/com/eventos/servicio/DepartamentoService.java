/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.eventos.servicio;

import com.eventos.domain.Departamento;
import java.util.List;

/**
 *
 * @author carta
 */
public interface DepartamentoService {
    public List<Departamento> listar();

    public void guardar(Departamento departamento);

    public void eliminar(Departamento departamento);

    public Departamento encontrarArea(Departamento departamento);
}
