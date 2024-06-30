package com.galaxy.herencia;

//Herencia
public class Circulo extends Figura {
    public Circulo(){
        //LLamando al constructor de la clase Padre
        super();
        System.out.println("Instancia del circulo");
    }

    int radio;   

}
