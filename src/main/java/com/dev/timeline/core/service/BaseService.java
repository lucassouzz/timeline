package com.dev.timeline.core.service;

import com.dev.timeline.core.Identifiable;
import com.dev.timeline.core.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public abstract class BaseService<ENTITY extends Identifiable, ID, REPOSITORY extends BaseRepository<ENTITY, ID>> {

    @Autowired
    private REPOSITORY repository;

    public Optional<ENTITY> findById(ID id) {
        return repository.findById(id);
    }

    public List<ENTITY> findAll() {
        return repository.findAll();
    }

    public ENTITY save(ENTITY entity) {
        return repository.save(entity);
    }

    public void delete(ID id) {
        Optional<ENTITY> entity = this.findById(id);
        entity.ifPresent(value -> repository.delete(value));
    }

    public ENTITY update(ID id, ENTITY entity) {
        Optional<ENTITY> oldEntity = this.findById(id);
        if (oldEntity.isPresent()) {
            entity.setId(oldEntity.get().getId());

            return this.save(entity);
        }

        return null;
    }
}
