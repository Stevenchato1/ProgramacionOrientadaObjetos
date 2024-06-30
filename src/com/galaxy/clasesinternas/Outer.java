package com.galaxy.clasesinternas;

public class Outer {
    private int outerVar = 10;

    class Inner{
        void display(){
            System.out.println("valor Outer " + outerVar);
        }
    }
}
