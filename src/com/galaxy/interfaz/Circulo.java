package com.galaxy.interfaz;

public class Circulo implements Forma {
    double radio;

    public Circulo(double radio){
        this.radio= radio;
    }

    @Override
    public void dibujar() {
       System.out.println("Dibujando ...");
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
}
