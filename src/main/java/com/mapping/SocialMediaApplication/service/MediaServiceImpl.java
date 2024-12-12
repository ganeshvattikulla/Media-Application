package com.mapping.SocialMediaApplication.service;

import com.mapping.SocialMediaApplication.model.SocialUser;
import com.mapping.SocialMediaApplication.repository.SocialUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaServiceImpl {
    @Autowired
    private SocialUserRepository socialUserRepository;


    public List<SocialUser> getAllUsers() {
        return socialUserRepository.findAll();
    }

    public SocialUser saveUser(SocialUser socialUser) {
        return socialUserRepository.save(socialUser);

    }

    public SocialUser updateUser(SocialUser socialUser, Long userId) {
        SocialUser user = socialUserRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User Not Found"));

        user.setUserId(userId);
        user.setUserName(socialUser.getUserName());

        if (socialUser.getSocialProfile() != null) {
            user.setSocialProfile(socialUser.getSocialProfile());
        }
        if (socialUser.getPosts() != null) {
            user.setPosts(socialUser.getPosts());
        }
        if (socialUser.getGroups() != null) {
            user.setGroups(socialUser.getGroups());
        }

        return socialUserRepository.save(user);
    }

    public String deleteUser(Long userId) {
        SocialUser user = socialUserRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User Not Found"));
        socialUserRepository.delete(user);
        return "Deleted Sucessfully";
    }
}
