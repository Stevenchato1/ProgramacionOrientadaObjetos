package com.galaxy.herencia;

public class Principal {
    public static void main(String[] args) {
        //Al instanciar un clase que tenga herencia, por defecto este constructor llama al constructor padre.
        Circulo circulo=new Circulo();
        Cuadrado cuadrado = new Cuadrado();
        Triangulo triangulo = new Triangulo();
        System.out.println(circulo.lado);
        System.out.println(circulo.radio);
        System.out.println(cuadrado.lado);
        System.out.println(triangulo);
        
    }
}
