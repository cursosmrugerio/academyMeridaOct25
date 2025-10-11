package com.curso.v2;

import java.sql.SQLOutput;

public class TestClass{
    public static void main(String[] args) {
        try{
            hello();
        }
        catch(MyException me){
            System.out.println(me); //com.curso.v2.MyException Exception from foo
        }
        System.out.println("FIN PROGRAMA");
    }

    static void hello() throws MyException{
        int[] dear = new int[7];
        dear[0] = 747;
        foo();
    }

    static void foo() throws MyException{
        throw new MyException("Exception from foo");
    }
}

class MyException extends Exception { //CHECKED
    public MyException(String msg){
        super(msg);
    }
}