package com.dev.timeline.user.factory;

import com.dev.timeline.user.User;
import com.dev.timeline.user.payload.UserPayload;
import org.springframework.stereotype.Component;

@Component
public class UserFactory {

    public User toEntity(UserPayload payload) {
        return User.builder()
                .id(payload.getId())
                .nome(payload.getNome())
                .username(payload.getUsername())
                .password(payload.getPassword())
                .gender(payload.getGender())
                .build();
    }
    
    public UserPayload toPayload(User entity) {
        return UserPayload.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .username(entity.getUsername())
                .password(entity.getPassword())
                .gender(entity.getGender())
                .build();
    }
}
