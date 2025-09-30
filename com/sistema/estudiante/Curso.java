package com.sistema.estudiante;
public class Curso{
    //ATRIBUTOS
    private String nombreCurso;
    private int creditos;

    public curso (String nombreCurso, int creditos){
        this.nombreCurso = nombreCurso;
        this.creditos = creditos;

    }
    public void setNombrecurso(String nombreCurso){
        this.nombreCurso = nombreCurso;
    }
    public String getNombreCurso(){
        return nombreCurso;
    }
    public void setCreditos(int creditos){
        this.creditos = creditos;

    }
    public int getCreditos(){
        return creditos;
    }
    

    


}