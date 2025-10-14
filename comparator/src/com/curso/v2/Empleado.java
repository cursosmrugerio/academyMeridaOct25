package com.curso.v2;

public class Empleado {

    private String nombre;
    private double sueldo;
    private int edad;

    public Empleado(String nombre, double sueldo, int edad) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", edad=" + edad +
                '}';
    }
}
