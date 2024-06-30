package com.galaxy.ejerciciouno;

public class Principal {
    public static void main(String[] args) {
        //Instancia de Objetos
        Estudiante estudiante = new Estudiante("Steven Huasupoma" , 3, "2 ");
        Estudiante estudiante2  = new Estudiante();
        
        //Usando el objeto se accede a sus métodos de la clase
        estudiante.estudiar();
        estudiante2.estudiar();

        estudiante.obtenerInformacion();
        estudiante2.obtenerInformacion();

       System.out.println( estudiante.getEdad());
       System.out.println(estudiante2.getEdad());

    }
}
