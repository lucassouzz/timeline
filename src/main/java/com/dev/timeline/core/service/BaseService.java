package com.dev.timeline.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class BaseService<ENTITY, ID> {

    @Autowired
    protected JpaRepository<ENTITY, ID> repository;

    Optional<ENTITY> findById(ID id) {
        return repository.findById(id);
    }

    List<ENTITY> findAll(){
        return repository.findAll();
    }

    ENTITY save(ENTITY entity) {
        return repository.save(entity);
    }

    void delete(ID id) {
        Optional<ENTITY> entity = this.findById(id);
        if(entity.isPresent()) {
            repository.delete((ENTITY) entity);
        }
    }
}
