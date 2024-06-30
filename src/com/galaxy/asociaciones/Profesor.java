package com.galaxy.asociaciones;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private int id;
    private String nombre;
    private String apellidos;
    private String especialidad;

    List<Estudiante> listaEstudiante = new ArrayList<Estudiante>();  //Relación de uno a muchos
        
}
