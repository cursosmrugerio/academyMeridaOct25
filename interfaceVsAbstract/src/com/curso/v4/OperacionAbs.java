package com.curso.v4;

public abstract class OperacionAbs implements Operacion {

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }

}
