package it.panda.chapter3.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class User {
    private Long userId;
    private String name;
    private String lastName;
    private String email;
    private Role role = Role.USER;
    private Boolean accountBlocked = false;
    private LocalDate accountCreated = LocalDate.now();

    public User(Long userId, String name, String lastName, String email, Role role) {
        this.userId = userId;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
    }
}
