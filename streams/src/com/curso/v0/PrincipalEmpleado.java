package com.curso.v0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PrincipalEmpleado {
    public static void main(String[] args) {
        System.out.println("v0");
        Empleado emp1 = new Empleado("Erasto", 100, 20);
        Empleado emp2 = new Empleado("Filologo", 200, 28);
        Empleado emp3 = new Empleado("Urbano", 40, 22);
        Empleado emp4 = new Empleado("Andronico", 80, 21);
        Empleado emp5 = new Empleado("Epeneto", 150, 18);

        List<Empleado> emps = Arrays.asList(emp1, emp2, emp3, emp4, emp5);

        //EDAD > 20
        //SUELDO > 50
        //LONGITUD DE NOMBRE > 5
        //ORDENA POR NOMBRE
        //List<String> listaNombre

        //PROGRAMACION DECLARATIVA: DIME EL "QUE", YA NO EL "COMO"
        List<String> listaNombres = emps.stream()// Stream<Empleado>
                .filter(e -> e.getEdad()>20 &
                                    e.getSueldo()>50 &
                                    e.getNombre().length()>5)
                .sorted(Comparator.comparing(Empleado::getNombre))
                .map(Empleado::getNombre)
                .peek(System.out::println)
                .collect(Collectors.toList()); //TERMINAL OPERATION

        System.out.println("Lista de nombres");
        listaNombres.forEach(System.out::println);

    }


}
