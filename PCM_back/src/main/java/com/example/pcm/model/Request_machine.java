package com.example.pcm.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "PCM")
public class Request_machine {
    @Id
    @Field(value = "name_machine")
    private String name_machine;

    @Field(value = "operation")
    private String operation;

    @Field(value = "parada")
    private Parada parada;

    @Field(value = "estado")
    private String estado;

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getName_machine(){
        return this.name_machine;
    }

    public void setName_machine(String name){
        this.name_machine = name;
    }

    public String getOperation() {
        return this.operation;
    }

    public void setOperation(String operation){
        this.operation = operation;
    }

    public void setParada(Parada parada) {
        this.parada = parada;
    }

    public Parada getParada() {
        return this.parada;
    }
}