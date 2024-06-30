package com.galaxy.metodosgenericos;

public class Principal {
    public static void main(String[] args) {
        Integer[] num = {1,2,4,6,7};
        String[] palabras  = {"Hola" , " Mundo" , "Steven"};

        Utilidades utilidades = new Utilidades();
        utilidades.imprimirArray(num);
        utilidades.imprimirArray(palabras);
        
    }
}
