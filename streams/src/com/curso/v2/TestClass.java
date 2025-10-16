package com.curso.v2;

import java.util.function.Function;

public class TestClass {

    double ratex = 0.50; //Variable de Instancia

    public static void main(String[] args) {
        double res = new TestClass().process(1.0,20);
        System.out.println(res); //5.50
    }

    public double process(double payment, int rate)    {
        double defaultrate = 0.10; //Variable Local //Efective Final <====
        //defaultrate = 0.20; //YA NO ES Efective Final
        Function<Integer, Double> f = x-> x + x * defaultrate;
        //defaultrate = 0.20; //YA NO ES Efective Final
        double res = f.apply(5);

        ratex = 0.90;
        Function<Integer, Double> f2 = x-> x + x * ratex; //Usando Variable de Instancia
        ratex = 0.70;

        return res; //5.50
    }
}
