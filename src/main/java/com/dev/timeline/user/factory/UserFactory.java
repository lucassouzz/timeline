package com.dev.timeline.user.factory;

import com.dev.timeline.core.factory.BaseFactory;
import com.dev.timeline.user.User;
import com.dev.timeline.user.payload.UserPayload;
import org.springframework.stereotype.Component;

@Component
public class UserFactory implements BaseFactory<User, UserPayload> {

    @Override
    public User toEntity(UserPayload payload) {
        return User.builder()
                .id(payload.getId())
                .name(payload.getName())
                .username(payload.getUsername())
                .password(payload.getPassword())
                .gender(payload.getGender())
                .build();
    }

    @Override
    public UserPayload toPayload(User entity) {
        return UserPayload.builder()
                .id(entity.getId())
                .name(entity.getName())
                .username(entity.getUsername())
                .password(entity.getPassword())
                .gender(entity.getGender())
                .build();
    }
}
