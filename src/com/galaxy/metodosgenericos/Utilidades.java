package com.galaxy.metodosgenericos;

public class Utilidades {
    
    <T> void imprimirArray(T[] array){
        for (T elemento : array) {
            System.out.println(elemento);
        }
        System.out.println();
    }
}
