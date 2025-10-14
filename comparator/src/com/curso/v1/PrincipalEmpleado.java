package com.curso.v1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PrincipalEmpleado {
    public static void main(String[] args) {
        System.out.println("v1");
        Empleado emp1 = new Empleado("Patrobas",100,20);
        Empleado emp2 = new Empleado("Aristobulo",200,28);
        Empleado emp3 = new Empleado("Andronico",40,22);
        Empleado emp4 = new Empleado("Erasto",80,21);
        Empleado emp5 = new Empleado("Epeneto",150,18);

        List<Empleado> emps = Arrays.asList(emp1,emp2,emp3,emp4,emp5);
        System.out.println("ORDENAR POR EDAD");
        showEmpleados(emps,(e1,e2) -> e1.getEdad()-e2.getEdad());
        System.out.println("ORDENAR POR SUELDO");
        showEmpleados(emps,(e1,e2) -> (int)(e1.getSueldo()-e2.getSueldo()));
        System.out.println("ORDENAR POR NOMBRE");
        showEmpleados(emps,(e1,e2) -> e1.getNombre().compareTo(e2.getNombre()));
    }

    static void showEmpleados(List<Empleado> empleados, Comparator<Empleado> comp){
        empleados.sort(comp);
        empleados.forEach(System.out::println);
    }
}
