package com.curso.v11;

public class TestClass {
    public static void main(String args[]) {

    	C o = new C();
    	
    	System.out.println(o.i); //30
    	System.out.println(((B)o).i); //20
    	System.out.println(((A)o).i); //10
    	System.out.println(((A)(B)(C)o).i); //10
    	
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
