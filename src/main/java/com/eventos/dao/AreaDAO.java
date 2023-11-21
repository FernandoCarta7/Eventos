package com.eventos.dao;

import com.eventos.domain.Area;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




/**
 *
 * @author carta
 */
@Repository
public interface AreaDAO extends CrudRepository<Area, Long>{
    
}
