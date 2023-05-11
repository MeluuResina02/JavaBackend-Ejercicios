/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerintegrador;

import Estudiante.Estudiante;
import ServicioEstudiante.Servicio;

/**
 *
 * @author melani
 */
public class EjerIntegrador {
    
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[8];
        estudiantes[0] = new Estudiante("Juan", 7.5);
        estudiantes[1] = new Estudiante("Pedro", 8.0);
        estudiantes[2] = new Estudiante("María", 6.5);
        estudiantes[3] = new Estudiante("Luis", 9.0);
        estudiantes[4] = new Estudiante("Ana", 8.5);
        estudiantes[5] = new Estudiante("Carlos", 4.0);
        estudiantes[6] = new Estudiante("Sofía", 6.0);
        estudiantes[7] = new Estudiante("Laura", 5.0);
        
        Servicio servicio = new Servicio();
        
        double promedioNotas = servicio.calcularPromedio(estudiantes);
        System.out.println("El promedio de notas del curso es :" + promedioNotas);
        
        String[] nombresArribaPromedio = servicio.obtenerNombresArribaPromedio(estudiantes, promedioNotas);
        System.out.println("Los estudiantes con nota mayor al promedio son: ");
        for (String nombre : nombresArribaPromedio){
            System.out.println(nombre);
        }
        
        System.out.println("Los estudiantes con nota mayor al promedio son: ");
        for(Estudiante estudiante : estudiantes){
            if(estudiante.getNota() > promedioNotas){
                System.out.println(estudiante.getNombre() + ": " + estudiante.getNota());
            }
        }
    }   
}
