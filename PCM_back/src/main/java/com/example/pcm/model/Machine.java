package com.example.pcm.model;

import java.util.ArrayList;

public class Machine {
    private String nome;
    private ArrayList<Paradas> paradas;

    public Machine(String name_machine, ArrayList<Paradas> paradas_iniciais) {
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