package com.example.pcm.model;

import javax.xml.crypto.Data;

public class Parada {
    private Data horario;
    private String motivo;
    private String tipo_parada;

    public Data getHorario() {
        return horario;
    }

    public String getTipo_parada() {
        return tipo_parada;
    }

    public void setTipo_parada(String tipo_parada) {
        this.tipo_parada = tipo_parada;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setHorario(Data horario) {
        this.horario = horario;
    }
}