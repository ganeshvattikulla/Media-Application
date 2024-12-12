package com.mapping.SocialMediaApplication.repository;

import com.mapping.SocialMediaApplication.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
