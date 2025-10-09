package com.curso.v4;

public class Exponente extends OperacionAbs {
    @Override
    public int ejecuta(int x, int y) {
        return (int)Math.pow(x,y);
    }
}

