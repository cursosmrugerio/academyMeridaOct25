package com.curso.v0;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        String[] arreglo = {"Aa","a","1","B","z","9"};

        System.out.println(Arrays.toString(arreglo));
        Arrays.sort(arreglo);
        System.out.println(Arrays.toString(arreglo));
        //1,9,Aa,B,a,z
    }
}
