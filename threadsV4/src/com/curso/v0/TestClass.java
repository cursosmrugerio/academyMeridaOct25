package com.curso.v0;

public class TestClass extends Thread {

    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    static volatile int i1, i2, j1, j2, k1, k2; //0

    @Override
    public void run() {
        while (true) {
            workWithLocks();
            workWithoutLocks();
        }
    }

    void workWithLocks() {
        System.out.println("Threads entran al mismo tiempo");
        synchronized (lock1) { //SOLO PUEDE ENTRAR UN HILO
            i1++;
            i2++;
        }
        synchronized (lock2) { //SOLO PUEDE ENTRAR UN HILO
            k1++;
            k2++;
        }
        j1++;
        j2++;
    }

    void workWithoutLocks() {
        if (i1 != i2) //LA LECTURA NO ESTA SINCRONIZADA
            System.out.println("i");
        if (j1 != j2)
            System.out.println("j");
        if (k1 != k2)
            System.out.println("k");
    }

    public static void main(String[] args) {
        new TestClass().start(); //Thread1
        new TestClass().start(); //Thread2
    }
}

