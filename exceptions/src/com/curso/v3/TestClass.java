package com.curso.v3;

public class TestClass{
    public static void main(String[] args) {
        try{
            hello();
        }
        catch(MyException | RuntimeException me ){
            System.out.println(me); //com.curso.v2.ArrayIndexOfBoundException
        }
        System.out.println("FIN PROGRAMA");
    }

    static void hello() throws MyException{
        int[] dear = new int[0];
        dear[0] = 747; //RuntimeException ArrayIndexOfBoundException
        foo(); //NO LLEGAMOS
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