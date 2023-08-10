package com.dev.timeline.experience.repository;

import com.dev.timeline.core.repository.BaseRepository;
import com.dev.timeline.experience.Experience;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends BaseRepository<Experience, Integer> {
}
