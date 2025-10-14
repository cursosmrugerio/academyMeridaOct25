package com.simu.v0;

import java.util.function.BiFunction;

public class Principal {
    public static void main(String[] args) {
        BiFunction<String, Integer, String> bf1 =
                (String s, Integer i) ->
                { return s.substring(0, i); };
        System.out.println(bf1.apply("Filologo",4)); //Filo

        BiFunction<String, Integer, String> bf2 =
                (s, i) -> s.substring(0, i);
        System.out.println(bf2.apply("Filologo",4));

        BiFunction<String, Integer, String> bf3 =
                (String s, Integer i) -> s.substring(0, i);
        System.out.println(bf3.apply("Filologo",4));
    }
}
