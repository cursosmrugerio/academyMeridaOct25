package com.curso.v2;

//           Suma IS-A    Operacion
public class Suma extends Operacion {
    @Override
    int ejecuta(int x, int y) {
        return x+y;
    }
}

