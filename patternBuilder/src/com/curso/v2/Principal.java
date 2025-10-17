package com.curso.v2;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        //Static nested class:
        //A static type defined at the member level of a class
        Task.TaskBuilder builder = new Task.TaskBuilder(0);
        Task tarea0 = builder.build();
        System.out.println(tarea0);

        Task tarea1 = new Task.TaskBuilder(1).build();
        System.out.println(tarea1);

        Task tarea2 = new Task.TaskBuilder(2)
                .setNombreTarea("Verificar Automovil")
                .build();
        System.out.println(tarea2);


        Task tarea3 = new Task.TaskBuilder(3)
                .setNombreTarea("Comprar Leche")
                .setAsigna(new StringBuilder("Patrobas"))
                .build();
        System.out.println(tarea3);

        Task tarea4 = new Task.TaskBuilder(4)
                .setNombreTarea("Comprar Leche")
                .setAsigna(new StringBuilder("Patrobas"))
                .setFechaRegistro(LocalDate.now())
                .setResponsable(new StringBuilder("Epeneto"))
                .build();
        System.out.println(tarea4);

        Task tarea5 = new Task.TaskBuilder(5)
                .setConcluida(true)
                .setFechaTermino(LocalDate.now())
                .setDescripcion("Para Baby")
                .setAsigna(new StringBuilder("Patrobas"))
                .setFechaRegistro(LocalDate.now())
                .setResponsable(new StringBuilder("Epeneto"))
                .setObservaciones("Exitosa!!!")
                .setNombreTarea("Comprar Leche")
                .build();
        System.out.println(tarea5);


        /* NO HAY ACCESO AL CONSTRUCTOR private
        Task tareaPirata = new Task(666,
                "Comprar Leche",
                "Leche para Baby",
                new StringBuilder("Patrobas"), //responsable
                LocalDate.now(),
                new StringBuilder("Epeneto"), //asigna
                null, //fechaTermino
                false,
                "En proceso");
        System.out.println(tareaPirata);
         */
    }
}
