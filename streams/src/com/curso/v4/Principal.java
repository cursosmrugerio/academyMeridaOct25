package com.curso.v4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Principal {
    static boolean flag; //Variable static //false
    public static void main(String[] args) {
        List<String> values = Arrays.asList("Alpha A", "Alpha B", "Alpha C");

        List<String> valores = Arrays.asList();
        //flag = values.stream().findAny().get().equals("Alpha");
        //flag = values.stream().findFirst().get().equals("Alpha");
        Optional<String> opt = valores.stream().findFirst();
        System.out.println("Optional Empty: "+opt.isEmpty());
//        String cadena = null;
//        if (opt.isPresent())
//            opt.get();
//        System.out.println("cadena: "+cadena);
        opt.ifPresent(System.out::println);

        String cadena = opt.orElse("SinDato");
        System.out.println("cadena: "+cadena);

        //flag = cadena.contains("Alpha");

        //flag = values.stream().allMatch(x ->x.equals("Alpha"));
        //flag = values.stream().anyMatch(str->str.equals("Alpha"));
        //flag = values.stream().noneMatch(z->z.equals("Alpha"));

        //System.out.println(flag);
    }
}
