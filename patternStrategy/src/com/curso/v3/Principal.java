package com.curso.v3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class Principal {

    public static void main(String[] args) {
        Number resultado;
        Calculadora<Double,Integer,Long> calc = new Calculadora<>();
        calc.setOperacion1(getOperacion());
        resultado = calc.ejecutaOperacionCalculadora(10.0,5);

        System.out.println("Resultado: "+resultado);
    }


    private static BiFunction<Double,Integer,Long> getOperacion() {

        List<BiFunction<Double,Integer,Long>> operaciones = List.of(
                (x, y) -> {
                    System.out.println("Suma: "+"x: "+x+", y: "+y);
                    return (long)(x + y);
                },
                (x, y) -> {
                    System.out.println("Resta: "+"x: "+x+", y: "+y);
                    return Double.valueOf(x - y).longValue();
                },
                (x,y) -> {
                    System.out.println("Exp: "+"x: "+x+", y: "+y);
                    return Double.valueOf(Math.pow(x,y)).longValue();
                },
                (z,w) -> {
                    System.out.println("División: "+"z: "+z+", w: "+w);
                    return (long)(z / w);
                },
                (pato1,pato2) -> {
                    System.out.println("Multi: " +"pato1: "+pato1+", pato2: "+pato2);
                    return (long)(pato1 * pato2);
                }
        );
        int aleatorio = new Random().nextInt(operaciones.size());
        return operaciones.get(aleatorio);
    }
}

/*      JAVA NO PERMITE ARREGLO DE GENERICS
        BiFunction<Double,Integer,Long>[] operaciones = {
                (Double x,Integer y) -> {
                    System.out.println("Suma: ");
                    return (long)(x + y);
                }
        };
 */