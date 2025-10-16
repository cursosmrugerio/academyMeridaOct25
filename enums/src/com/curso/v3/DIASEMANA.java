package com.curso.v3;

public enum DIASEMANA {
    LUNES,
    MARTES,
    MIERCOLES("Baja"),
    JUEVES("Media"),
    VIERNES("Alta"),
    SABADO("Alta"),
    DOMINGO;

    private String visitantes = "Sin Visitantes";

    //private
    DIASEMANA(String visitantes) {
        this.visitantes = visitantes;
    }
    //private
    DIASEMANA() {}

    public String getVisitantes() {
        return visitantes;
    }
}
