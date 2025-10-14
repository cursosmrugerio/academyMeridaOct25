package com.curso.v0;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PrincipalEmpleado {
    public static void main(String[] args) {

        PrintStream ps = System.out;
        ps.println("Iniciando....");

        Empleado emp1 = new Empleado("Patrobas",100,20);
        Empleado emp2 = new Empleado("Aristobulo",200,28);
        Empleado emp3 = new Empleado("Andronico",40,22);
        Empleado emp4 = new Empleado("Erasto",80,21);
        Empleado emp5 = new Empleado("Epeneto",150,18);

        Empleado[] empleados = {emp1,emp2,emp3,emp4,emp5};
        Arrays.sort(empleados);

        List<Empleado> lista = Arrays.asList(empleados);
        lista.forEach(System.out::println);

//      Consumer<Empleado> consumer = e -> ps.println(e);
//      lista.forEach(ps::println);
    }
}
