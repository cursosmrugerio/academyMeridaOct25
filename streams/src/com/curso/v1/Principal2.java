package com.curso.v1;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal2 {
    public static void main(String[] args) {
        Stream<String> ss = Stream.of("a", "b", "a", "b", "c", "b");

        Map<String, Long> data =
                ss.collect(Collectors.groupingBy(
                        Function.identity(), //static t -> t
                        Collectors.counting())); //a=2 b=3 c=1

        System.out.println(data);
        //{a=2, b=3, c=1}



    }
}
