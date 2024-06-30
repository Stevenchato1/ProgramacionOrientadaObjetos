package com.galaxy.sobrecargametodo;

public class Principal {
    public static void main(String[] args) {
        Calculadora calculadora =new Calculadora();
        System.out.println(calculadora.sumar(200.0, 100.0));
        System.out.println(calculadora.sumar(10.5, 10));
        System.out.println(calculadora.sumar(10, 20)); 
    }


}
