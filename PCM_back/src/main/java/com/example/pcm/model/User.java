package com.example.pcm.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Users")
public class User {

    @Id
    @Field(value = "email")
    private String email;

    @Field(value = "senha")
    private String senha;

    public User(String email,String senha){
        this.email = email;
        this.senha = senha;
    }
    

    public void setemail(String email){
        this.email= email;
    }


    public String getemail(){
        return email;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }


    public String getSenha(){
        return senha;
    }

    public String toString(){
        return "User email: " + email + " senha :" + senha;
    }

}