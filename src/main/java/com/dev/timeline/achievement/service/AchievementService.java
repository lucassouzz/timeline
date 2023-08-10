package com.dev.timeline.achievement.service;

import com.dev.timeline.achievement.Achievement;
import com.dev.timeline.achievement.repository.AchievementRepository;
import com.dev.timeline.core.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class AchievementService extends BaseService<Achievement, Integer, AchievementRepository> {
}
