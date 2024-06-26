package com.dev.timeline.experience.service;

import com.dev.timeline.core.service.BaseService;
import com.dev.timeline.experience.Experience;
import com.dev.timeline.experience.repository.ExperienceRepository;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService extends BaseService<Experience, Integer, ExperienceRepository> {
}
