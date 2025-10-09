package com.curso.v1;

public abstract class Operacion {

    int x;
    int y;

    Operacion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract int ejecuta();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " [x=" + x + ", y=" + y + "]";
    }
}
