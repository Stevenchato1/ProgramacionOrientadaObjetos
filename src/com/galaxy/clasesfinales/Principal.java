package com.galaxy.clasesfinales;

public class Principal {
    public static void main(String[] args) {
        //La clase finales no se pueden extender
        //Las clases finales no pueden tener subclases
        //Las clases finales solo se pueden instanciar para tener acceso
        ClaseFinal claseFinal = new ClaseFinal();
        claseFinal.metodo();
    }
}
