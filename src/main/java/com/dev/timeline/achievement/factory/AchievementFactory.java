package com.dev.timeline.achievement.factory;

import com.dev.timeline.achievement.Achievement;
import com.dev.timeline.achievement.payload.AchievementPayload;
import com.dev.timeline.core.factory.BaseFactory;
import org.springframework.stereotype.Component;

@Component
public class AchievementFactory implements BaseFactory<Achievement, AchievementPayload> {
    @Override
    public Achievement toEntity(AchievementPayload achievementPayload) {
        return null;
    }

    @Override
    public AchievementPayload toPayload(Achievement achievement) {
        return null;
    }
}
