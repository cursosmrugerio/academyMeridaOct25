package com.curso.v2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal0 {
    public static void main(String[] args) {

        //dList TAMAÑO FIJO PORQUE SU FUENTE EN UN Array
        List<Double> Lista = Arrays.asList(10.0, 12.0, 20.0, 30.0, 40.0);
        List<Double> dList = new ArrayList<>(Lista);

        //dList.forEach(x->{ x = x + 10; });
        //dList.forEach(x->System.out.println(x));

        dList.replaceAll(x->x+10);
        dList.forEach(System.out::println);
        System.out.println("************");
        dList.removeIf(x -> x < 30);
        dList.forEach(System.out::println); //30,40,50

        System.out.println("************");
        String[] arreglo = {"java","javascript","python"};
        List<String> listaArreglo = Arrays.asList(arreglo);

        arreglo[0] = "php";

        listaArreglo.forEach(System.out::println); //php javascript python


    }
}
