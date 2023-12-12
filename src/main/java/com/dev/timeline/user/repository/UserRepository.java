package com.dev.timeline.user.repository;

import com.dev.timeline.core.repository.BaseRepository;
import com.dev.timeline.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends BaseRepository<User, Integer> {
}
