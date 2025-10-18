package com.curso.v1B;

import java.time.LocalDate;

public class TaskBuilder {

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
