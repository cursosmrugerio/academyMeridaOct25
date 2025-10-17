package com.curso.v0;

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

    Task(int idTask,
         String nombreTarea,
         String descripcion,
         StringBuilder responsable) {
        this.idTask = idTask;
        this.nombreTarea = nombreTarea;
        this.descripcion = descripcion;
        this.responsable = responsable;
    }

    Task(int idTask,
         String nombreTarea,
         String descripcion,
         StringBuilder responsable,
         LocalDate fechaRegistro,
         StringBuilder asigna) {
        this.idTask = idTask;
        this.nombreTarea = nombreTarea;
        this.descripcion = descripcion;
        this.responsable = responsable;
        this.fechaRegistro = fechaRegistro;
        this.asigna = asigna;
    }

    Task(int idTask,
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

    public Task(int idTask) {
        this.idTask = idTask;
    }

    public Task(int idTask,
                String nombreTarea) {
        this.idTask = idTask;
        this.nombreTarea = nombreTarea;
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
}
