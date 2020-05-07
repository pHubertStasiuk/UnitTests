package it.panda.chapter3.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SignUpRequest {
    private String name;
    private String email;
    private String password;
    private String matchingPassword;
    private String imageUrl;
}
