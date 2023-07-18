package com.dev.timeline.user.controller;

import com.dev.timeline.user.User;
import com.dev.timeline.user.factory.UserFactory;
import com.dev.timeline.user.payload.UserPayload;
import com.dev.timeline.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("user")
public class UserController {
    private final UserFactory factory;
    private final UserService service;

    @PutMapping
    public UserPayload create(@RequestBody UserPayload payload) {
        User user = factory.toEntity(payload);

        return factory.toPayload(service.save(user));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        service.delete(id);

        return ResponseEntity.ok().build();
    }

    @PostMapping("{id}")
    public UserPayload update(@PathVariable Integer id, @RequestBody UserPayload payload) {
        User user = factory.toEntity(payload);

        return factory.toPayload(service.update(id, user));
    }

    @GetMapping("{id}")
    public UserPayload findById(@PathVariable Integer id) {
        return factory.toPayload(service.findById(id));
    }
}
