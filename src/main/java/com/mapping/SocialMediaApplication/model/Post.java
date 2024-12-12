package com.mapping.SocialMediaApplication.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    private String postName;

    @ManyToOne
    @JoinColumn(name = "user_Id", referencedColumnName = "userId")
    @JsonIgnore
    private SocialUser socialUser;

}
