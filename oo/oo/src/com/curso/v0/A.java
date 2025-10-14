package com.curso.v0;


class A {
    public static void sM1() {
        System.out.println("In base static");
    }
}

class B extends A {
    //Line 1 --> // HIDDEN
//    public static void sM1() {
//        System.out.println("In sub static");
//    }
    // Line 2 --> //
//    public void sM1() {
//        System.out.println("In sub non-static");
//    }
}