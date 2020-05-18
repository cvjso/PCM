package com.example.pcm.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "PCM")
public class User {

    @Field(value = "id")
    private String id;

    @Field(value = "senha")
    private String senha;

    public User(String id,String senha){
        this.id = id;
        this.senha = senha;
    }
    

    public void setid(String id){
        this.id = id;
    }


    public String getid(){
        return id;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }


    public String getSenha(){
        return senha;
    }

    public String toString(){
        return "User email: " + id + " senha :" + senha;
    }

}