package com.example.pcm.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Machines")
public class Machine {

    @Id
    @Field(value = "name_machine")
    private String NameMachine;

    @Field(value = "parada")
    private ArrayList<Parada> paradas;

    public Machine(String name_machine, ArrayList<Parada> paradas_iniciais) {
        this.NameMachine = name_machine;
        this.paradas = paradas_iniciais;
	}

	public String getNameMachine() {
        return NameMachine;
    }

    public ArrayList<Parada> getParadas() {
        return paradas;
    }

    public void setParadas(ArrayList<Parada> paradas) {
        this.paradas = paradas;
    }

    public void setNameMachine(String NameMachine) {
        this.NameMachine = NameMachine;
    }
}