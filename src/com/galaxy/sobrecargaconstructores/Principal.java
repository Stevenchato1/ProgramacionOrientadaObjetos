package com.galaxy.sobrecargaconstructores;

public class Principal {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan");
        Estudiante estudiante2 = new Estudiante("Steven", 27);
        
        System.out.println(estudiante.nombre);
        System.out.println(estudiante2.nombre + " su edad es " + estudiante2.edad);
    }
}
