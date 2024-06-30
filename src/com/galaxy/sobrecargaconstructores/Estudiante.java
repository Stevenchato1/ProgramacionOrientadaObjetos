package com.galaxy.sobrecargaconstructores;

public class Estudiante {
    
    String nombre;
    int edad;

    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante(String nombre){
        this.nombre = nombre;
    }

    public Estudiante(){}

}
