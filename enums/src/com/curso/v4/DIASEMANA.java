package com.curso.v4;

public enum DIASEMANA implements InterfaceDia {
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

    @Override
    public String getVisitantes() {
        return visitantes;
    }

    @Override
    public String toString() {
        return name()+"#";
    }
}
