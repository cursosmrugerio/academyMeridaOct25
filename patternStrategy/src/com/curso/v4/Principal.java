package com.curso.v4;

import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;

public class Principal {

    public static void main(String[] args) {
        Number resultado;
        Calculadora<Double, Integer, Double> calc = new Calculadora<>();
        calc.<Double, Integer, Double>setOperacion1(getOperacion());
        resultado = calc.ejecutaOperacionCalculadora(10.0, 5);
        System.out.println("Resultado: " + resultado);

        Calculadora<Float, Long, Double> calc2 = new Calculadora<>();
        calc2.setOperacion1(getOperacion());
        resultado = calc2.ejecutaOperacionCalculadora(10.0f, 5L);
        System.out.println("Resultado: " + resultado);

        Calculadora<Byte, Double, Double> calc3 = new Calculadora<>();
        calc3.setOperacion1(getOperacion());
        resultado = calc3.ejecutaOperacionCalculadora((byte)10,5.0);
        System.out.println("Resultado: "+resultado);

        Calculadora<Byte, Short, Double> calc4 = new Calculadora<>();
        calc4.setOperacion1(getOperacion());
        resultado = calc4.ejecutaOperacionCalculadora((byte)10,(short)5);
        System.out.println("Resultado: "+resultado);
    }

    private static <X extends Number,Y extends Number,Z extends Number>
        BiFunction<X,Y,Double> getOperacion() {

        List<BiFunction<X,Y,Double>> operaciones = List.of(
                (x, y) -> {
                    System.out.println("Suma: "+"x: "+x+", y: "+y);
                    return x.doubleValue()+y.doubleValue();
                },
                (x, y) -> {
                    System.out.println("Resta: "+"x: "+x+", y: "+y);
                    return x.doubleValue()-y.doubleValue();
                },
                (x,y) -> {
                    System.out.println("Exp: "+"x: "+x+", y: "+y);
                    return Math.pow(x.doubleValue(),y.doubleValue());
                },
                (z,w) -> {
                    System.out.println("División: "+"z: "+z+", w: "+w);
                    return z.doubleValue() / w.doubleValue();
                },
                (pato1,pato2) -> {
                    System.out.println("Multi: " +"pato1: "+pato1+", pato2: "+pato2);
                    return pato1.doubleValue() * pato2.doubleValue();
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