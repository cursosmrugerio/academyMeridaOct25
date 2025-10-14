package com.curso.v3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PrincipalEmpleado {
    public static void main(String[] args) {
        System.out.println("v3");
        Empleado emp1 = new Empleado("Aristobulo", 100, 20);
        Empleado emp2 = new Empleado("Aristobulo", 200, 28);
        Empleado emp3 = new Empleado("Aristobulo", 40, 22);
        Empleado emp4 = new Empleado("Aristobulo", 80, 20);
        Empleado emp5 = new Empleado("Epeneto", 150, 18);

        List<Empleado> emps = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
        System.out.println("ORDEN INVERSO POR NOMBRE/EDAD/SUELDO");
        Comparator<Empleado> comp =
                Comparator.comparing(Empleado::getNombre) //static
                          .thenComparingInt(Empleado::getEdad) //default
                          .thenComparingDouble(Empleado::getSueldo) //default
                          .reversed(); //default
        showEmpleados(emps, comp);
    }

    static void showEmpleados(List<Empleado> empleados, Comparator<Empleado> comp) {
        empleados.sort(comp);
        empleados.forEach(System.out::println);
    }
}
