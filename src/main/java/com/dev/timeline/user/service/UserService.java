package com.dev.timeline.user.service;

import com.dev.timeline.user.User;
import com.dev.timeline.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository repo;

    public User findById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public User save(User user){
        return repo.save(user);
    }

    public User update(Integer id, User newUser) {
        User oldUser = findById(id);
        newUser.setId(oldUser.getId());

        return save(newUser);
    }

    public void delete(Integer id) {
        User user = findById(id);

        repo.delete(user);
    }
}
