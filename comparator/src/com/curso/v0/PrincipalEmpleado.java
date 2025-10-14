package com.curso.v0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PrincipalEmpleado {
    public static void main(String[] args) {
        System.out.println("v3");
        Empleado emp1 = new Empleado("Patrobas",100,20);
        Empleado emp2 = new Empleado("Aristobulo",200,28);
        Empleado emp3 = new Empleado("Andronico",40,22);
        Empleado emp4 = new Empleado("Erasto",80,21);
        Empleado emp5 = new Empleado("Epeneto",150,18);
        Empleado[] empleados = {emp1,emp2,emp3,emp4,emp5};

        //ORDENAR POR EDAD
        Comparator<Empleado> compEdad =
                (e1,e2) -> e1.getEdad()-e2.getEdad();
        Arrays.sort(empleados,compEdad);
        System.out.println("ORDENA POR EDAD");
        List<Empleado> lista = Arrays.asList(empleados);
        lista.forEach(System.out::println);

        //ORDENAR POR SUELDO
        Comparator<Empleado> compSueldo =
                (e1,e2) -> (int)(e1.getSueldo()-e2.getSueldo());
        Arrays.sort(empleados,compSueldo);
        System.out.println("ORDENA POR SUELDO");
        lista = Arrays.asList(empleados);
        lista.forEach(System.out::println);

        //ORDENAR POR NOMBRE
        Comparator<Empleado> compNom =
                (e1,e2) -> e1.getNombre().compareTo(e2.getNombre());
        Arrays.sort(empleados,compNom);
        System.out.println("ORDENA POR NOMBRE");
        lista = Arrays.asList(empleados);
        lista.forEach(System.out::println);

    }
}
