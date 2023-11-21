package com.eventos.dao;

import com.eventos.domain.TipoEmpleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEmpleadoDAO extends CrudRepository<TipoEmpleado, Long>{
    
}
