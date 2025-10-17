package com.curso.v1;

//           Suma IS-A       Operacion
public class Division implements Operacion {
    @Override
    public int ejecuta(int x, int y) {
        return x/y;
    }
}

