package com.curso.v1B;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        TaskBuilder tb1 = new TaskBuilder(1);
        Task tarea = tb1.build();
        System.out.println(tarea);

        TaskBuilder tb2 = new TaskBuilder(2);
        tb2.setNombreTarea("Verificar Automovil");
        Task tarea0 = tb2.build();
        System.out.println(tarea0);

        TaskBuilder tb3 = new TaskBuilder(3);
        tb3.setNombreTarea("Comprar Leche");
        tb3.setAsigna(new StringBuilder("Patrobas"));
        Task tarea1 = tb3.build();
        System.out.println(tarea1);

        Task tarea4 = new TaskBuilder(4)
            .setNombreTarea("Comprar Leche")
            .setAsigna(new StringBuilder("Patrobas"))
            .setFechaRegistro(LocalDate.now())
            .setResponsable(new StringBuilder("Epeneto"))
            .build();
        System.out.println(tarea4);

        Task tarea5 = new TaskBuilder(5)
            .setFechaTermino(LocalDate.now())
            .setDescripcion("Para Baby")
            .setAsigna(new StringBuilder("Patrobas"))
            .setFechaRegistro(LocalDate.now())
            .setResponsable(new StringBuilder("Epeneto"))
            .setObservaciones("Exitosa!!!")
            .setConcluida(true)
            .setNombreTarea("Comprar Leche")
            .build();

        System.out.println(tarea5);

        //OCULTAR
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
    }
}
