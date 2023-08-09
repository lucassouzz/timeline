package com.dev.timeline.user;

import com.dev.timeline.user.enumeration.GenderEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String username;
    private String password;
    @Enumerated(value = EnumType.STRING)
    private GenderEnum gender;
}
