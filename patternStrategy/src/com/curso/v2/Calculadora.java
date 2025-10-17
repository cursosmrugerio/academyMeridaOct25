package com.curso.v2;

import java.util.function.IntBinaryOperator;

//Strategy Context
public class Calculadora {
    //HAS-A //INTERFACE
    private IntBinaryOperator operacion1;

    int ejecutaOperacionCalculadora(int a,int b){
        return operacion1.applyAsInt(a,b); //EJECUTA LA LAMBDA
    }

    public IntBinaryOperator getOperacion1() {
        return operacion1;
    }

    public void setOperacion1(IntBinaryOperator operacion1) {
        this.operacion1 = operacion1;
    }
}
