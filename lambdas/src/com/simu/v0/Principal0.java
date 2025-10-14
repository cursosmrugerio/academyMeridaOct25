package com.simu.v0;

import java.util.function.UnaryOperator;

public class Principal0 {

    public static void main(String[] args) {
        String val1 = "hello";
        StringBuilder val2 = new StringBuilder("world");
        UnaryOperator<String> uo1 = s1->s1.concat(val1);//1
        UnaryOperator<String> uo2 = s->s.toUpperCase();//2

        //System.out.println(uo1.apply(uo2.apply(val2)));
        //String cadena = uo2.apply(val2); //NO COMPILE
    }
}
