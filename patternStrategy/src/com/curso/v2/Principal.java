package com.curso.v2;

import java.util.Random;
import java.util.function.IntBinaryOperator;

public class Principal {

    public static void main(String[] args) {
        int resultado;
        Calculadora calc = new Calculadora();

        calc.setOperacion1(getOperacion());

        resultado = calc.ejecutaOperacionCalculadora(20,5);
        System.out.println("Resultado: "+resultado);
    }

    private static IntBinaryOperator getOperacion() {
        IntBinaryOperator[] operaciones = {
                (x,y) -> {
                    System.out.println("Suma: ");
                    return x + y;
                },
                (x, y) -> {
                    System.out.println("Resta: ");
                    return x - y;
                },
                (x,y) -> {
                    System.out.println("Exp: ");
                    return (int)(Math.pow(x,y));
                },
                (z,w) -> {
                    System.out.println("División: ");
                    return z / w;
                },
                (pato1,pato2) -> {
                    System.out.println("Multi: ");
                    return pato1 * pato2;
                }
        };
        int aleatorio = new Random().nextInt(operaciones.length);
        return operaciones[aleatorio];
    }
}
