package com.curso.v5;

public abstract interface Operacion {

    //public static final
    int x=0; //constante
    String cadena="Hello"; //No puede cambiar la referencia

    public abstract int ejecuta(int x,int y);

}
