/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eventos.servicio;

import com.eventos.dao.PaisDAO;
import com.eventos.domain.Pais;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author carta
 */
@Service
@Repository
public class PaisServiceImp implements PaisService {

    @Autowired
    private PaisDAO paisDao;

    @Override
    @Transactional(readOnly = true)
    public List<Pais> listar() {
        /*List<Pais> listaPais = new ArrayList<>();
        Pais pais = new Pais();
        pais.setCodPais(10000);
        pais.setNombre("Pais Nuevo");
        listaPais.add(pais);*/
        
        //return listaPais;
        return (List<Pais>) paisDao.findAll();
    }

    @Override
    public void guardar(Pais pais) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Pais pais) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Pais encontrarArea(Pais pais) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
