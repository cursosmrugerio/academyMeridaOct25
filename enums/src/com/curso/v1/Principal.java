package com.curso.v1;

public class Principal {

    public static void main(String[] args) {
        DIASEMANA diaPago = DIASEMANA.VIERNES;
        DIASEMANA diaDescanso = DIASEMANA.DOMINGO;

        System.out.println("DiaPago: "+diaPago);
        System.out.println("DiaDescanso: "+diaDescanso);

        for(DIASEMANA dia: DIASEMANA.values()){
            System.out.println(dia);
            System.out.println(dia.ordinal()); //NO SE OCUPA
            System.out.println(dia.name());
            System.out.println("*****");
        }

        DIASEMANA dia = DIASEMANA.SABADO;

        switch (dia){
            case LUNES:
                System.out.println("Sin Visitantes");
                break;
            case MARTES:
                System.out.println("Baja Visitantes");
                break;
            case MIERCOLES:
                System.out.println("Media Visitantes");
                break;
            case JUEVES:
                System.out.println("Media Visitantes");
                break;
            case VIERNES:
                System.out.println("Alta Visitantes");
                break;
            case SABADO:
                System.out.println("Alta Visitantes");
                break;
            case DOMINGO:
                System.out.println("Alta Visitantes");
                break;
            default:
                System.out.println("Cerrado");
        }

    }
}
