package com.curso.v5;

//           Suma IS-A       Operacion
public class Suma implements Operacion {
    @Override
    public int ejecuta(int x, int y) {
        return x+y;
    }
}

