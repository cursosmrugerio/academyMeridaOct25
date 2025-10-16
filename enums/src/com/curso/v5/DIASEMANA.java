package com.curso.v5;

public enum DIASEMANA implements InterfaceDia {
    LUNES{
        @Override
        int cantidadMaxima(){
            return 0;
        }
    },
    MARTES{
        @Override
        int cantidadMaxima(){
            return 0;
        }
    },
    MIERCOLES("Baja"){
        @Override
        int cantidadMaxima(){
            return 500;
        }
    },
    JUEVES("Media"){
        @Override
        int cantidadMaxima(){
            return 1000;
        }
    },
    VIERNES("Alta"){
        @Override
        int cantidadMaxima(){
            return 2000;
        }
    },
    SABADO("Alta"){
        @Override
        int cantidadMaxima(){
            return 2000;
        }
    },
    DOMINGO{
        @Override
        int cantidadMaxima(){
            return 0;
        }
    };

    private String visitantes = "Sin Visitantes";
    static int contador;

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

    public static void main(String[] args) {
        for (DIASEMANA d : DIASEMANA.values()) {
            System.out.println(d);
            System.out.println(d.getVisitantes());
            System.out.println(d.cantidadMaxima());
            System.out.println("***********");
        }
    }

    abstract int cantidadMaxima();
}
