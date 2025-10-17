package com.curso.v2;

import java.time.LocalDate;

public class Task { //OBJETO COMPLEJO
    private int idTask;
    private String nombreTarea;
    private String descripcion;
    private StringBuilder responsable;
    private LocalDate fechaRegistro;
    private StringBuilder asigna;
    private LocalDate fechaTermino;
    private boolean concluida;
    private String observaciones;

    private Task(int idTask,
         String nombreTarea,
         String descripcion,
         StringBuilder responsable,
         LocalDate fechaRegistro,
         StringBuilder asigna,
         LocalDate fechaTermino,
         boolean concluida,
         String observaciones) {
        this.idTask = idTask;
        this.nombreTarea = nombreTarea;
        this.descripcion = descripcion;
        this.responsable = responsable;
        this.fechaRegistro = fechaRegistro;
        this.asigna = asigna;
        this.fechaTermino = fechaTermino;
        this.concluida = concluida;
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return " idTask="+ idTask +
                ", nombreTarea=" + nombreTarea +
                ", descripcion=" + descripcion  +
                ", responsable=" + responsable +
                ", fechaRegistro=" + fechaRegistro +
                ", asigna=" + asigna +
                ", fechaTermino=" + fechaTermino +
                ", concluida=" + concluida +
                ", observaciones=" + observaciones;
    }

    //Static nested class:
    //A static type defined at the member level of a class
    static public class TaskBuilder {
        private int idTask;
        private String nombreTarea;
        private String descripcion;
        private StringBuilder responsable;
        private LocalDate fechaRegistro;
        private StringBuilder asigna;
        private LocalDate fechaTermino;
        private boolean concluida;
        private String observaciones;

        TaskBuilder(int idTask) {
            this.idTask = idTask;
        }

        TaskBuilder setNombreTarea(String nombreTarea) {
            this.nombreTarea = nombreTarea;
            return this;
        }
        TaskBuilder setDescripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }
        TaskBuilder setResponsable(StringBuilder responsable) {
            this.responsable = responsable;
            return this;
        }
        TaskBuilder setFechaRegistro(LocalDate fechaRegistro) {
            this.fechaRegistro = fechaRegistro;
            return this;
        }
        TaskBuilder setAsigna(StringBuilder asigna) {
            this.asigna = asigna;
            return this;
        }
        TaskBuilder setFechaTermino(LocalDate fechaTermino) {
            this.fechaTermino = fechaTermino;
            return this;
        }
        TaskBuilder setConcluida(boolean concluida) {
            this.concluida = concluida;
            return this;
        }
        TaskBuilder setObservaciones(String observaciones) {
            this.observaciones = observaciones;
            return this;
        }

        Task build() {
            return new Task(idTask,
                    nombreTarea,
                    descripcion,
                    responsable,
                    fechaRegistro,
                    asigna,
                    fechaTermino,
                    concluida,
                    observaciones);
        }
    }
}
