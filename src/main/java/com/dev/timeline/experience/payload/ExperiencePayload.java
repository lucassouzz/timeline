package com.dev.timeline.experience.payload;

import com.dev.timeline.achievement.Achievement;
import com.dev.timeline.achievement.payload.AchievementPayload;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class ExperiencePayload {
    private Integer id;
    private String company;
    private String description;
    private List<AchievementPayload> achievements;
}
