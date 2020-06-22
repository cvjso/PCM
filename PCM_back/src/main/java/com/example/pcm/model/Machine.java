package com.example.pcm.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Machines")
public class Machine {

    @Id
    @Field(value = "nameMachine")
    private String nameMachine;

    @Field(value = "parada")
    private ArrayList<Parada> paradas;

    @Field(value = "estado")
    private String estado;

    public Machine(String nameMachine, ArrayList<Parada> paradas, String estado) {
        this.nameMachine = nameMachine;
        this.paradas = paradas;
        this.estado = estado;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

	public String getnameMachine() {
        return nameMachine;
    }

    public ArrayList<Parada> getParadas() {
        return paradas;
    }

    public void setParadas(ArrayList<Parada> paradas) {
        this.paradas = paradas;
    }

    public void setnameMachine(String nameMachine) {
        this.nameMachine = nameMachine;
    }
}