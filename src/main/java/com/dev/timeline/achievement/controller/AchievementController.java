package com.dev.timeline.achievement.controller;

import com.dev.timeline.achievement.Achievement;
import com.dev.timeline.achievement.factory.AchievementFactory;
import com.dev.timeline.achievement.payload.AchievementPayload;
import com.dev.timeline.achievement.repository.AchievementRepository;
import com.dev.timeline.achievement.service.AchievementService;
import com.dev.timeline.core.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("achievement")
public class AchievementController extends BaseController<
        Achievement,
        Integer,
        AchievementRepository,
        AchievementService,
        AchievementFactory,
        AchievementPayload> {
}
