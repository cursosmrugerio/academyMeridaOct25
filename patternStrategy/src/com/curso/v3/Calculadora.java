package com.curso.v3;

import java.util.function.BiFunction;

public class Calculadora<T,U,R> {

    private BiFunction<T,U,R> operacion1;

    R ejecutaOperacionCalculadora(T a,U b){
        return operacion1.apply(a,b); //EJECUTA LA LAMBDA
    }

    public void setOperacion1(BiFunction<T,U,R> operacion1) {
        this.operacion1 = operacion1;
    }
}
