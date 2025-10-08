package com.curso.v10;

public class TestClass {
    public static void main(String args[]) {
    	A o1 = new C();
    	B o2 = (B)o1;
    	
    	System.out.println(o1.m1()); //30
    	System.out.println(o2.m1()); //30
    	
    	System.out.println(o1.i); //10
    	System.out.println(o2.i); //20
    	
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
