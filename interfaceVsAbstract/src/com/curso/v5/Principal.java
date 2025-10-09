package com.curso.v5;

public class Principal {

    public static void main(String[] args) {
        Operacion ope1 = new Suma();
        Operacion ope2 = new Resta();
        Operacion ope3 = new Multi();
        Operacion ope4 = new Exponente();

        System.out.println("V3");

        System.out.println(ope1.getClass().getSimpleName());
        System.out.println(ope1.ejecuta(8,4)); //12
        System.out.println(ope2.getClass().getSimpleName());
        System.out.println(ope2.ejecuta(8,4)); //4
        System.out.println(ope3.getClass().getSimpleName());
        System.out.println(ope3.ejecuta(8,4)); //32
        System.out.println(ope4.getClass().getSimpleName());
        System.out.println(ope4.ejecuta(8,4)); //8*8*8*8=4096
    }
}
