package com.curso.v9;

public class TestClass {
    public static void main(String args[]) {
        C c = new C();
        System.out.println(c.m1()); //30
        B b = new C();
        System.out.println(b.m1()); //30
        A a = new C();
        System.out.println(a.m1()); //30
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
