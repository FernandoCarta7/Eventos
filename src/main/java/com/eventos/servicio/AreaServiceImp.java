package com.eventos.servicio;

import com.eventos.dao.AreaDAO;
import com.eventos.domain.Area;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Repository
public class AreaServiceImp implements AreaService {

    @Autowired
    private AreaDAO areaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Area> listar() {
        return (List<Area>) areaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Area area) {
        areaDao.save(area);
    }

    @Override
    @Transactional
    public void eliminar(Area area) {
        areaDao.delete(area);
    }

    @Override
    @Transactional(readOnly = true)
    public Area encontrarArea(Area area) {
        return areaDao.findById(area.getArea_codigo()).orElse(null);
    }

}
