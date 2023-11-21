/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eventos.servicio;

import com.eventos.dao.CiudadDAO;
import com.eventos.domain.Ciudad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

/**
 *
 * @author carta
 */
@Service
public class CiudadServiceImp implements CiudadService {

    @Autowired
    private CiudadDAO ciudadDao;

    @Override
    @Transactional(readOnly = true)
    public List<Ciudad> listar() {
        return (List<Ciudad>) ciudadDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Ciudad ciudad) {
        ciudadDao.save(ciudad);
    }

    @Override
    @Transactional
    public void eliminar(Ciudad ciudad) {
        ciudadDao.delete(ciudad);
    }

    @Override
    @Transactional(readOnly = true)
    public Ciudad encontrarArea(Ciudad ciudad) {
        List<Ciudad> lista = (List<Ciudad>) ciudadDao.findAll();
        boolean bandera = true;
        int i = 0;
        while (bandera && i <= lista.size()) {
            if (lista.get(i).getCod_ciudad().equals(ciudad.getCod_ciudad())) {
                bandera = false;
                return ciudad;

            } else {
                i++;
            }
        }
        return null;
    }

}
