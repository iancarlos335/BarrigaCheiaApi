package org.example.dao;

import org.example.dto.DonerDTO;
import org.example.entities.Doner;

public interface DonerDAO{

    //crud

    void saveEntity(Doner entity);

    Doner getById(Long id);

    void updateEntity(Doner entity);

    void deleteEntity(Long id);


}
