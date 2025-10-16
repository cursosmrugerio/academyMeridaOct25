package com.curso.v4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal2 {
    static boolean flag; //Variable static //false
    public static void main(String[] args) {
        List<String> values = Arrays.asList("Alpha A", "Alpha B", "Alpha C");
        Stream<String> myStream = values.stream();

        //UN STREAM SOLO UNA VEZ SE PUEDE APLICAR
        flag = myStream.findAny().get().equals("Alpha");
        flag = values.stream().findFirst().get().equals("Alpha");
        flag = values.stream().allMatch(x ->x.equals("Alpha"));

        System.out.println(flag);

        IntStream myOtherStream = values.stream() //NO SE EJECUTA
                .filter(x -> x.contains("Alpha"))
                .filter(x -> x.contains("B"))
                .peek(System.out::println)
                .mapToInt(z -> z.length()); //
        //PORQUE NO EXISTE UNA OPERACION TERMINAL

        //Long res = myOtherStream.count();
        long res = myOtherStream.sum();
        System.out.println(res);





    }
}
