package com.galaxy.ejerciciodos;

public class Principal {
    public static void main(String[] args) {
        //Instanciando la clase Vehiculo
        Vehiculo vehiculo = new Vehiculo("ford", "chevy","2004");
        System.out.println(vehiculo.getMarca());
        vehiculo.setMarca("Nissan");
        System.out.println(vehiculo.getMarca());
    }
}
