package com.mapping.SocialMediaApplication.controller;

import com.mapping.SocialMediaApplication.model.SocialUser;
import com.mapping.SocialMediaApplication.service.MediaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MediaController {
    @Autowired
    private MediaServiceImpl mediaService;

    @GetMapping("/social/users")
    public ResponseEntity<List<SocialUser>> getUsers() {
        return new ResponseEntity<>(mediaService.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping("/social/users")
    public ResponseEntity<SocialUser> saveUser(@RequestBody SocialUser socialUser) {
        return new ResponseEntity<>(mediaService.saveUser(socialUser), HttpStatus.OK);
    }

    @PutMapping("/social/users/{userId}")
    public ResponseEntity<SocialUser> saveUser(@RequestBody SocialUser socialUser, @PathVariable Long userId) {
        return new ResponseEntity<>(mediaService.updateUser(socialUser, userId), HttpStatus.OK);
    }

    @DeleteMapping("/social/users/{userId}")
    public ResponseEntity<String> saveUser(@PathVariable Long userId) {
        return new ResponseEntity<>(mediaService.deleteUser(userId), HttpStatus.OK);
    }


}
