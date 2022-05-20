/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;

public class EjemploTres {
    public static void main(String[] args) {
        // crear un arreglo de objetos de tipo Calificacion
        Calificacion [] calificaciones = {new Calificacion(10, "Computación"), 
            new Calificacion(10, "Electrónica"),
            new Calificacion(9, "Electrónica"),
            new Calificacion(3.3, "Electrónica")    
            };
        
        System.out.println("------------------------------------------");
        System.out.printf("%s\n",calificaciones[2]);
        System.out.println("------------------------------------------");   
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f\n", 
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota());
        }
        
    }
}
