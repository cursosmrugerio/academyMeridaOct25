package com.curso.v3;

public class Principal {

    public static void main(String[] args) {

        //Enum implements Comparable
        int i = DIASEMANA.LUNES.compareTo(DIASEMANA.SABADO);
        //NEGATIVO
        System.out.println(i);

        for(DIASEMANA d : DIASEMANA.values()){
            System.out.println(d+", Visitantes: "+d.getVisitantes());
        }
    }
}
