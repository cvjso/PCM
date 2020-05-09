package com.example.pcm.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

    String email;
    String senha;

    public User(String email,String senha){
        this.email = email;
        this.senha = senha;
    }
    

    public void setEmail(String email){
        this.email = email;
    }


    public String getEmail(){
        return email;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }


    public String getSenha(){
        return senha;
    }

    public String toString(){
        return "User email:" + email + "senha:" + senha;
    }

}