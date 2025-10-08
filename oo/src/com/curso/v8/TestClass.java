package com.curso.v8;

public class TestClass {
    public static void main(String args[]) {
        C c = new C();
        System.out.println(c.i); //30
        B b = new C();
        System.out.println(b.i); //20
        A a = new C();
        System.out.println(a.i); //10
    }
}

class A {
    int i = 10;
    int m1() { return i; }
}

class B extends A {
    int i = 20; //HIDDEN
    int m1() { return i; } //OVERRIDING
}

class C extends B {
    int i = 30; //HIDDEN
    int m1() { return i; } //OVERRIDING
}
