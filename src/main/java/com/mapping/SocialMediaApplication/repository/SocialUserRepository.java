package com.mapping.SocialMediaApplication.repository;

import com.mapping.SocialMediaApplication.model.SocialUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialUserRepository extends JpaRepository<SocialUser, Long> {
}
