package com.dev.timeline.experience.factory;

import com.dev.timeline.achievement.factory.AchievementFactory;
import com.dev.timeline.achievement.service.AchievementService;
import com.dev.timeline.core.factory.BaseFactory;
import com.dev.timeline.experience.Experience;
import com.dev.timeline.experience.payload.ExperiencePayload;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ExperienceFactory implements BaseFactory<Experience, ExperiencePayload> {

    private final AchievementService achievementService;
    private final AchievementFactory achievementFactory;

    @Override
    public Experience toEntity(ExperiencePayload payload) {
        return Experience.builder()
                .company(payload.getCompany())
                .description(payload.getDescription())
                .achievements(payload.getAchievements().stream()
                        .map(achievement -> achievementService.findById(achievement.getId()).get())
                        .toList())
                .build();
    }

    @Override
    public ExperiencePayload toPayload(Experience entity) {
        return ExperiencePayload.builder()
                .id(entity.getId())
                .company(entity.getCompany())
                .description(entity.getDescription())
                .achievements(entity.getAchievements().stream()
                        .map(achievementFactory::toPayload)
                        .toList())
                .build();
    }
}
