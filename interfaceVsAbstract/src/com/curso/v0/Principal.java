package com.curso.v0;

public class Principal {

    public static void main(String[] args) {
        Operacion ope1 = new Operacion(8,4);
        Operacion ope2 = new Suma(8,4);
        Operacion ope3 = new Resta(8,4);

        System.out.println(ope1.ejecuta()); //0
        System.out.println(ope2.ejecuta()); //12
        System.out.println(ope3.ejecuta()); //4
    }

}
