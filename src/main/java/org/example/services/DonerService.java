package org.example.services;

import org.example.dto.DonerDTO;
import org.example.entities.Doner;
import org.example.repositories.DonerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DonerService {

    @Autowired
    DonerRepository repository;


    @Transactional
    public DonerDTO salvar(DonerDTO dto) {
        Doner entity = new Doner();
        BeanUtils.copyProperties(dto, entity);

        repository.saveEntity(entity);
        return dto;
    }

    public List<Doner> encontrarTodos() {
        return repository.findAll();
    }

    public Doner encontrarDoador(Long id) {
        return repository.findById(id);
    }

    public void atualizarDoador(Doner entity) {
        repository.update(entity);
    }

    public void deletarDoador(Long id) {
        repository.delete(id);
    }
}
