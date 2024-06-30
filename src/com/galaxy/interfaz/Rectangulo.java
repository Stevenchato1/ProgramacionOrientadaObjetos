package com.galaxy.interfaz;

public class Rectangulo implements Forma {
    double ancho;
    double alto;

    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando el rectángulo...");
    }

    @Override
    public double calcularArea() {
        return this.ancho * this.alto;
    }
}
