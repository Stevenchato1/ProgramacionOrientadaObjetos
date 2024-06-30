package com.galaxy.ejerciciouno;

public class Estudiante {
    //Encapsulamiento
    private String nombre;
    private int edad;
    private String numeroEstudiantes;

    //Constructores
    public Estudiante(){
        System.out.println("Constructor vacío por defecto");
    }

    public Estudiante(String nombre, int edad, String numeroEstudiante){
        System.out.println("Constructor con parámetros");
        this.nombre = nombre;
        this.edad  = edad;
        this.numeroEstudiantes = numeroEstudiante;
    }

    //Métodos
    public void estudiar(){
        System.out.println("Estudiando...");
    }

    public void obtenerInformacion(){
        System.out.println(getNombre());
    }
    
    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void setNumeroEstudiantes(String numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

  
}
