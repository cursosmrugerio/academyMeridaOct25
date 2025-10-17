package com.curso.v1;

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

        TaskBuilder tb4 = new TaskBuilder(4);
        tb4.setNombreTarea("Comprar Leche");
        tb4.setAsigna(new StringBuilder("Patrobas"));
        tb4.setFechaRegistro(LocalDate.now());
        tb4.setResponsable(new StringBuilder("Epeneto"));
        Task tarea4 = tb4.build();
        System.out.println(tarea4);

        TaskBuilder tb5 = new TaskBuilder(5);
        tb5.setFechaTermino(LocalDate.now());
        tb5.setDescripcion("Para Baby");
        tb5.setAsigna(new StringBuilder("Patrobas"));
        tb5.setFechaRegistro(LocalDate.now());
        tb5.setResponsable(new StringBuilder("Epeneto"));
        tb5.setObservaciones("Exitosa!!!");
        tb5.setConcluida(true);
        tb5.setNombreTarea("Comprar Leche");
        Task tarea5 = tb5.build();
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
