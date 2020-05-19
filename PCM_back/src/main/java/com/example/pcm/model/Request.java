package com.example.pcm.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "PCM")
public class Request {
    @Id
    @Field(value = "email")
    private String email;

    @Field(value = "senha")
    private String senha;

    public String getEmail(){
        return this.email;
    }

    public String getSenha(){
        return this.senha;
    }

}