package com.dev.timeline.experience.factory;

import com.dev.timeline.core.factory.BaseFactory;
import com.dev.timeline.experience.Experience;
import com.dev.timeline.experience.payload.ExperiencePayload;
import org.springframework.stereotype.Component;

@Component
public class ExperienceFactory implements BaseFactory<Experience, ExperiencePayload> {
    @Override
    public Experience toEntity(ExperiencePayload experiencePayload) {
        return null;
    }

    @Override
    public ExperiencePayload toPayload(Experience experience) {
        return null;
    }
}
