package com.curso.v1;

import java.util.Random;

public class Principal {

    public static void main(String[] args) {
        int resultado;
        Calculadora calc = new Calculadora();

        calc.setOperacion1(getOperacion());

        resultado = calc.ejecutaOperacionCalculadora(8,4);
        System.out.println("Resultado: "+resultado);
    }

    private static Operacion getOperacion() {
        Operacion[] operaciones = {
                new Suma(),
                new Resta(),
                new Exponente(),
                new Division(),
                new Multi()
        };
        int aleatorio = new Random().nextInt(operaciones.length);
        Operacion operacion = operaciones[aleatorio];
        System.out.println(operacion.getClass().getSimpleName());
        return operacion;
    }


}
