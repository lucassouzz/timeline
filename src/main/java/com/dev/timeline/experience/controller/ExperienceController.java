package com.dev.timeline.experience.controller;

import com.dev.timeline.core.controller.BaseController;
import com.dev.timeline.experience.Experience;
import com.dev.timeline.experience.factory.ExperienceFactory;
import com.dev.timeline.experience.payload.ExperiencePayload;
import com.dev.timeline.experience.repository.ExperienceRepository;
import com.dev.timeline.experience.service.ExperienceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("experience")
public class ExperienceController extends BaseController<
        Experience,
        Integer,
        ExperienceRepository,
        ExperienceService,
        ExperienceFactory,
        ExperiencePayload> {
}
