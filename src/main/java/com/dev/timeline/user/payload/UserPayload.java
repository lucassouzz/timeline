package com.dev.timeline.user.payload;

import com.dev.timeline.user.enumeration.GenderEnum;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserPayload {
    private Integer id;
    private String name;
    private String username;
    private String password;
    private GenderEnum gender;
}
