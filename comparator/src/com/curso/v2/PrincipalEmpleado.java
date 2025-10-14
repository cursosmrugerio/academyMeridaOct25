package com.curso.v2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class PrincipalEmpleado {
    public static void main(String[] args) {
        System.out.println("v2");
        Empleado emp1 = new Empleado("Patrobas", 100, 20);
        Empleado emp2 = new Empleado("Aristobulo", 200, 28);
        Empleado emp3 = new Empleado("Andronico", 40, 22);
        Empleado emp4 = new Empleado("Erasto", 80, 21);
        Empleado emp5 = new Empleado("Epeneto", 150, 18);

        List<Empleado> emps = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
        System.out.println("ORDENAR POR EDAD");
        //Comparator<Empleado> compEdad =
        //                (e1,e2) -> e1.getEdad()-e2.getEdad();
        //ToIntFunction<Empleado> tif = emp -> emp.getEdad();
        //Clase :: MethodInstance
        //tif = Empleado::getEdad;
        showEmpleados(emps, Comparator.comparingInt(Empleado::getEdad));
        System.out.println("ORDENAR POR SUELDO");
        //Comparator<Empleado> compSueldo =
        //                (e1,e2) -> (int)(e1.getSueldo()-e2.getSueldo());
        showEmpleados(emps, Comparator.comparingDouble(Empleado::getSueldo));
        System.out.println("ORDENAR POR NOMBRE");
        //Comparator<Empleado> compNom =
        //                (e1,e2) -> e1.getNombre().compareTo(e2.getNombre());
        //Function<Empleado,String> func = emp -> emp.getNombre();
        //func = Empleado::getNombre; //Clase :: MethodInstance
        showEmpleados(emps, Comparator.comparing(Empleado::getNombre));
    }

    static void showEmpleados(List<Empleado> empleados, Comparator<Empleado> comp) {
        empleados.sort(comp);
        empleados.forEach(System.out::println);
    }
}
