package com.dev.timeline.user.controller;

import com.dev.timeline.core.controller.BaseController;
import com.dev.timeline.user.User;
import com.dev.timeline.user.factory.UserFactory;
import com.dev.timeline.user.payload.UserPayload;
import com.dev.timeline.user.repository.UserRepository;
import com.dev.timeline.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("user")
public class UserController extends BaseController<
        User,
        Integer,
        UserRepository,
        UserService,
        UserFactory,
        UserPayload> {
}
