package com.galaxy.clasesabstractas;

public class Principal {
    //Las clase abstractas no se pueden instanciar
    //Por se debe instanciar de una clase que haya extendido la clase abstracta 
    //La clase abstracta puede contener métodos abstractos o no 
    //Los métodos abstractos no se implementan
    //Las clases abstractas se extienden con extends
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.redimensionar();
        circulo.dibujar();
    }

}
