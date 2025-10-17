package com.curso.v0;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {

        Task tarea = new Task(1);
        System.out.println(tarea);

        Task tarea0 = new Task(2,"Verificar Automovil");
        System.out.println(tarea0);

        Task tarea1 = new Task(3,"Comprar Leche",
                "Leche para Baby",
                new StringBuilder("Patrobas"));
        System.out.println(tarea1);

        Task tarea2 = new Task(4,"Comprar Leche",
                "Leche para Baby",
                new StringBuilder("Patrobas"),
                LocalDate.now(),
                new StringBuilder("Epeneto"));
        System.out.println(tarea2);

        Task tarea3 = new Task(5,"Comprar Leche",
                "Leche para Baby",
                new StringBuilder("Patrobas"), //responsable
                LocalDate.now(),
                new StringBuilder("Epeneto"), //asigna
                null, //fechaTermino
                false,
                "En proceso");
        System.out.println(tarea3);

    }

}
