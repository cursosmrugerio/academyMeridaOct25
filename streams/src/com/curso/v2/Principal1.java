package com.curso.v2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Principal1 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(2, 4, 6, 9,1,4,3,7);
        Predicate<Integer> check = (Integer i) -> {
            System.out.println("Checking");
            return i == 4; //true
        };

        Predicate even = (i) -> ((Integer)i) % 2 == 0;

        long l = values.stream()
                .filter(check) //Checking Checking Checking Checking
                .peek(i -> System.out.println("Elemento: "+i))
                .filter(even)
                .count(); //1

        System.out.println("count: "+ l);
    }
}
