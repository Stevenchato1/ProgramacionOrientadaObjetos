package com.galaxy.ejerciciodos;

public class Vehiculo {
    
    //Atributos
    private String marca;
    private String modelo;
    private String anio;

   
    //Constructor con parámetros
    public Vehiculo(String marca, String modelo, String anio){
        this.marca= marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    //Métodos
    public void acelerar(){
        System.out.println("acelerando...");
    }

    public void frenar(){
        System.out.println("frenandoo....");
    }

    //Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
}
