package com.mapping.SocialMediaApplication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocialUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long userId;
    private String userName;

    @OneToOne(mappedBy = "socialUser", cascade = CascadeType.ALL)
    private SocialProfile socialProfile;

    @OneToMany(mappedBy = "socialUser", cascade = CascadeType.ALL)
    private List<Post> posts;

    @ManyToMany(mappedBy = "socialUsers", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<SocialGroup> groups = new HashSet<>();
}
