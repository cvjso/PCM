package com.example.pcm.model;


public class Parada {
    private String horario;
    private String motivo;
    private String tipo_parada;

    public String getHorario() {
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

    public void setHorario(String horario) {
        this.horario = horario;
    }
}