package com.example.pcm.model;

import java.util.ArrayList;

import javax.xml.crypto.Data;

public class Paradas {
    private Data horario;
    private ArrayList<String> motivos;

    public Data getHorario() {
        return horario;
    }

    public ArrayList<String> getMotivos() {
        return motivos;
    }

    public void setMotivos(ArrayList<String> motivos) {
        this.motivos = motivos;
    }

    public void setHorario(Data horario) {
        this.horario = horario;
    }
}