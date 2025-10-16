package com.curso.v4;

public class Principal {

    public static void main(String[] args) {

        //Enum implements Comparable
        int i = DIASEMANA.LUNES.compareTo(DIASEMANA.SABADO);
        //NEGATIVO
        System.out.println(i);

        InterfaceDia id = DIASEMANA.LUNES;

        for(DIASEMANA d : DIASEMANA.values()){
            System.out.println(d+", Visitantes: "+d.getVisitantes());
        }

        DIASEMANA ds =  DIASEMANA.valueOf("LUNES");



    }
}
