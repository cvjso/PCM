package com.example.pcm.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Machines")
public class Machine {

    @Id
    @Field(value = "nome")
    private String nome;

    @Field(value = "paradas")
    private ArrayList<Paradas> paradas;

    public Machine(String name_machine, ArrayList<Paradas> paradas_iniciais) {
        this.nome = name_machine;
        this.paradas = paradas_iniciais;
	}

	public String getNome() {
        return nome;
    }

    public ArrayList<Paradas> getParadas() {
        return paradas;
    }

    public void setParadas(ArrayList<Paradas> paradas) {
        this.paradas = paradas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}