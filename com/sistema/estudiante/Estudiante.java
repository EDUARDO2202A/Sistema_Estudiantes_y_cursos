package com.sistema.estudiante;

public class Estudiante {
    private String nombre;
    private Curso curso;

    public Estudiante(String nombre, Curso curso) {
        this.nombre = nombre;
        this.curso = curso;
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.curso = null;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public String getInfoEstudiante() {
        String nombreCurso = (this.curso != null) ? this.curso.getNombre() : "no asignado";
        return "Nombre: " + this.nombre + ", Curso: " + nombreCurso;
    }

    @Override
    public String toString() {
        return getInfoEstudiante();
    }
}