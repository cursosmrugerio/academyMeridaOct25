package com.curso.v1;

public class TestClass extends Thread {

    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    static volatile int i1, i2, j1, j2, k1, k2; //0

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        while (true) {
            workWithLocks();
            workWithoutLocks();
        }
    }

    void workWithLocks() {
        //System.out.println("Threads entran al mismo tiempo");
        synchronized (lock1) { //SOLO PUEDE ENTRAR UN HILO
            i1++; //NO ES UNA OPERACION ATOMICA
            i2++;
        }
        synchronized (lock2) { //SOLO PUEDE ENTRAR UN HILO
            k1++;
            k2++;
        }
        j1++; //PUEDEN EJECUTARLO VARIOS HILOS A LA VEZ
        j2++; //PUEDEN EJECUTARLO VARIOS HILOS A LA VEZ
    }

    void workWithoutLocks() {
        synchronized (lock1) {
            if (i1 != i2)
                System.out.println("i");
        }
        //if (j1 != j2)
            //System.out.println("j");
        synchronized (lock2) {
            if (k1 != k2)
                System.out.println("k");
        }
    }

    public static void main(String[] args) {
        System.out.println("Begin......");
        new TestClass().start(); //Thread1
        new TestClass().start(); //Thread2
        new TestClass().start();
        new TestClass().start();
        new TestClass().start();
        new TestClass().start();
    }
}

