package com.curso.v1;

public class Resta implements Operacion {
    @Override
    public int ejecuta(int x, int y) {
        return x-y;
    }
}

