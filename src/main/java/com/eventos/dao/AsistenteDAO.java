/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eventos.dao;

import com.eventos.domain.Asistente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author carta
 */
@Repository
public interface AsistenteDAO extends CrudRepository<Asistente, Long>{
    
}
