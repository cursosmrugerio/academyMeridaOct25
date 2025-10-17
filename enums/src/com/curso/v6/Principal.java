package com.curso.v6;

public class Principal {
    int i;
    public enum DIASEMANA { //static
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES;
    }
    public static void main(String[] args) {
        System.out.println("i: "+new Principal().i);
        System.out.println(DIASEMANA.LUNES);
    }
}
