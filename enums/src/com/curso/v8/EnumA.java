package com.curso.v8;

import java.io.Serializable;

interface I{} //marker interfaces

public enum EnumA implements I, Serializable {
    A,AA,AAA
}

class TestClass {

    public static enum EnumC {
        C,CC,CCC
    }

    TestClass(){

    }

    public static void main(String[] args) {
        System.out.println(EnumC.valueOf("ccc"));
    }

    public enum EnumB{
        B,BB,BBB;
//        public Object clone(){ //NO SE PUEDE SOBREESCRIBIR
//            return B;
//        }
    }
}
