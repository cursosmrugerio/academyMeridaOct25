package com.curso.v1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("a", "b");
        List<String> l2 = Arrays.asList("1", "2");

        Stream.of(l1, l2)
                .flatMap((x)->x.stream())
                .forEach((x)->System.out.println(x));

        System.out.println("**********");

        Stream.of(l1, l2)
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        System.out.println("**********");

        Stream<List<String>> myStream1 = Stream.of(l1,l2);

        //APLANAR flatMap() //OPERACION INTERMEDIA
        Function<List<String>, Stream<String>> function = lista -> lista.stream();
        Stream<String> myStream2 =
                myStream1.flatMap(function);

        //OPERACION TERMINAL //Consumer
        Consumer<String> consumer = (x) -> System.out.println(x);
        myStream2.forEach(consumer);

    }
}
