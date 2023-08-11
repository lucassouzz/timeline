package com.dev.timeline.achievement.factory;

import com.dev.timeline.achievement.Achievement;
import com.dev.timeline.achievement.payload.AchievementPayload;
import com.dev.timeline.core.factory.BaseFactory;
import org.springframework.stereotype.Component;

@Component
public class AchievementFactory implements BaseFactory<Achievement, AchievementPayload> {
    @Override
    public Achievement toEntity(AchievementPayload payload) {
        return Achievement.builder()
                .title(payload.getTitle())
                .description(payload.getDescription())
                .build();
    }

    @Override
    public AchievementPayload toPayload(Achievement entity) {
        return AchievementPayload.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .description(entity.getDescription())
                .build();
    }
}
