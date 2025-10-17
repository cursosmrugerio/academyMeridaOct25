package com.curso.v0;

public class Principal {

    public static void main(String[] args) {
        int resultado;
        Calculadora calc = new Calculadora(new Suma());

        resultado = calc.ejecutaOperacionCalculadora(8,4);
        System.out.println("Resultado: "+resultado);

        calc.setOperacion1(new Resta());
        resultado = calc.ejecutaOperacionCalculadora(8,4);
        System.out.println("Resultado: "+resultado);

        calc.setOperacion1(new Exponente());
        resultado = calc.ejecutaOperacionCalculadora(8,4);
        System.out.println("Resultado: "+resultado);
    }
}
