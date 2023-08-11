package com.dev.timeline.achievement.payload;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AchievementPayload {
    private Integer id;
    private String title;
    private String description;
}
