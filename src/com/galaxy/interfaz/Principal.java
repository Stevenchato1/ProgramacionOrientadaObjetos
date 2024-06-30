package com.galaxy.interfaz;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3);
        circulo.dibujar();
        System.out.println(circulo.calcularArea());

        //Instanciando la clase Rectangulo que contiene una interface
        Rectangulo rectangulo = new Rectangulo(10.0, 10.0);
        rectangulo.dibujar();
        System.out.println(rectangulo.calcularArea());
    }
}
