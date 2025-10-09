package com.curso.v4;

//           Suma IS-A       Operacion
public class Suma extends OperacionAbs {

    @Override
    public int ejecuta(int x, int y) {
        return x+y;
    }
}

