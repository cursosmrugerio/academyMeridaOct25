package com.curso.v4;

public class Principal {

    public static void main(String[] args) {
        Operacion ope1 = new Suma();
        Operacion ope2 = new Resta();
        Operacion ope3 = new Multi();
        Operacion ope4 = new Exponente();

        System.out.println("V4");

        System.out.println(ope1);
        System.out.println(ope1.ejecuta(8,4)); //12
        System.out.println(ope2);
        System.out.println(ope2.ejecuta(8,4)); //4
        System.out.println(ope3);
        System.out.println(ope3.ejecuta(8,4)); //32
        System.out.println(ope4);
        System.out.println(ope4.ejecuta(8,4)); //8*8*8*8=4096

        OperacionAbs ope5 = new Suma();
        System.out.println(ope5);
        System.out.println(ope5.ejecuta(10,5));

        Resta ope6 = new Resta();
        System.out.println(ope6);
        System.out.println(ope6.ejecuta(10,5));
    }
}
