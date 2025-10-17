package com.curso.v0;

//           Suma IS-A       Operacion
public class Suma implements Operacion {
    @Override
    public int ejecuta(int x, int y) {
        return x+y;
    }
}

