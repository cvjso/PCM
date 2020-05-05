package com.example.PMC.model;

import java.util.UUID;

public class User {
    private UUID id;
    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void setId(UUID id){
        this.id = id;
    }
    public void setemail(String email){
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public String getemail() {
        return this.email;
    }

    public UUID getId() {
        return this.id;
    }
}