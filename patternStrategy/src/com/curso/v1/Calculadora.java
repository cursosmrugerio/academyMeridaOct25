package com.curso.v1;

//Strategy Context
public class Calculadora {
    //HAS-A //INTERFACE
    private Operacion operacion1;

    int ejecutaOperacionCalculadora(int a,int b){
        return operacion1.ejecuta(a,b);
    }

    public Operacion getOperacion1() {
        return operacion1;
    }

    public void setOperacion1(Operacion operacion1) {
        this.operacion1 = operacion1;
    }
}
