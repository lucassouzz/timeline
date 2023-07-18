package com.dev.timeline.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class User {

    @Id
    private Long id;
    private String nome;
    private String username;
    private String password;
    private String gender;
}
