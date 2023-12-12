package com.dev.timeline.user.service;

import com.dev.timeline.core.service.BaseService;
import com.dev.timeline.user.User;
import com.dev.timeline.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService extends BaseService<
        User,
        Integer,
        UserRepository> {
}
