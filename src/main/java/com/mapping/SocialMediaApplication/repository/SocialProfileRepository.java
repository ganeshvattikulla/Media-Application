package com.mapping.SocialMediaApplication.repository;

import com.mapping.SocialMediaApplication.model.SocialProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialProfileRepository extends JpaRepository<SocialProfile, Long> {
}
