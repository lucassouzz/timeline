package com.dev.timeline.core.controller;

import com.dev.timeline.core.Identifiable;
import com.dev.timeline.core.factory.BaseFactory;
import com.dev.timeline.core.repository.BaseRepository;
import com.dev.timeline.core.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.stream.Collectors;

public abstract class BaseController<
        ENTITY extends Identifiable,
        ID,
        REPO extends BaseRepository<ENTITY, ID>,
        SERVICE extends BaseService<ENTITY, ID, REPO>,
        FACTORY extends BaseFactory<ENTITY, PAYLOAD>,
        PAYLOAD> {

    @Autowired
    private SERVICE service;
    @Autowired
    private FACTORY factory;

    @PutMapping
    public PAYLOAD create(@RequestBody PAYLOAD payload) {
        ENTITY entity = factory.toEntity(payload);

        return factory.toPayload(service.save(entity));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable ID id) {
        service.delete(id);

        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public PAYLOAD findById(@PathVariable ID id) {
        Optional<ENTITY> entity = service.findById(id);

        return entity.map(value -> factory.toPayload(value))
                .orElse(null);
    }

    @PostMapping("{id}")
    public PAYLOAD update(@PathVariable ID id, @RequestBody PAYLOAD payload) {
        ENTITY entity = factory.toEntity(payload);

        return factory.toPayload(service.update(id, entity));
    }

    @GetMapping("paged")
    public Page<PAYLOAD> getPaged(Pageable pageable) {
        Page<ENTITY> page = service.findPageable(pageable);

        return page.map(factory::toPayload);
    }
}
