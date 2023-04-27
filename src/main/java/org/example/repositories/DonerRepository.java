package org.example.repositories;

import org.example.dao.AbstractDAO;
import org.example.dao.DonerDAO;
import org.example.dto.DonerDTO;
import org.example.entities.Doner;
import org.springframework.stereotype.Repository;

@Repository
public class DonerRepository extends AbstractDAO<Doner, Long> implements DonerDAO {


    @Override
    public void saveEntity(Doner entity) {
        save(entity);
    }

    @Override
    public Doner getById(Long id) {
        return findById(id);
    }

    @Override
    public void updateEntity(Doner entity) {
        update(entity);
    }

    @Override
    public void deleteEntity(Long id) {

    }
}
