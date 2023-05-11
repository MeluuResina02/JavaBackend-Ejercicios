/*
 * 
 */
package ejer6_alumnos_g9;

import Entidades.Alumnos;
import ServicioAlumnos.ServicioAlumnos;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejer6_Alumnos_G9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicioAlumnos cursoService = new ServicioAlumnos();
        
        int opcion = 0;
        do{
            System.out.println("\n===== Menú =====");
            System.out.println("1. Crear curso");
            System.out.println("2. Mostrar cursos");
            System.out.println("3. Salir");
            System.out.println("Ingrese la opcion que desee");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion){
                case 1:
                    Alumnos curso = new Alumnos();
                    curso.crearCurso();
                    cursoService.agregarCurso(curso);
                    break;
                case 2:
                    ArrayList<Alumnos> cursos = cursoService.getCursos();
                    if (cursos.size() == 0){
                        System.out.println("No hay cursos creados.");
                    }else{
                        for (Alumnos c : cursos){
                            System.out.println("Curso: " + c.getNombreCurso());
                            System.out.println("Horas por día: " + c.getCantidadHorasPorDia());
                            System.out.println("Días por semana: " + c.getCantidadDiasPorSemana());
                            System.out.println("Turno: " + c.getTurno());
                            System.out.println("Precio por hora: " + c.getPrecioPorHora());
                            System.out.println("Aumnos:");
                            for (String alumno : c.getAlumnos()){
                                System.out.println(alumno);
                            }
                            System.out.println("Ganancia semanal: $" + c.calcularGananciaSemanal());
                            System.out.println("=========");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Hasta luego...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
            } while (opcion != 3);
        }
    }
   
