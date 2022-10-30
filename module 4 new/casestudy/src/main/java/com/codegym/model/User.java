package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
public class User {
    @Id
    @Size(max=255)
    @NotEmpty
    private String  username;
    @Size(max=255)
    @NotEmpty
    private String password;

    @ManyToMany(mappedBy = "user")
    private Set<Role> roles;
//
//    @OneToMany(mappedBy = "username")
//    private Set<employee> employees;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
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
}

