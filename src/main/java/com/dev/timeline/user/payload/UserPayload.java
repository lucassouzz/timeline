package com.dev.timeline.user.payload;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserPayload {
    private Long id;
    private String nome;
    private String username;
    private String password;
    private String gender;
}
