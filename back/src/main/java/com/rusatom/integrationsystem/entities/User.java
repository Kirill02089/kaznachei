package com.rusatom.integrationsystem.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="RA_USERS")
public class User {

    public enum Role {USER, ADMIN}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String email;
    @NotNull
    @Enumerated(javax.persistence.EnumType.STRING)
    @Column
    private Role role;

    public User(String username, String password, String email, @NotNull Role role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
