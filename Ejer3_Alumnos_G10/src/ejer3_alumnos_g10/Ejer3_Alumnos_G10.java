/*
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package ejer3_alumnos_g10;

import ServicioAlumnos.ServicioAlumno;
import java.util.Scanner;

/**
 *
 * @author melani
 */
public class Ejer3_Alumnos_G10 {
    
    public static void main(String[] args) {
        ServicioAlumno servicio = new ServicioAlumno();
        Scanner sc = new Scanner(System.in);
        String opcion;
        
        do{
            servicio.agregarAlumno();
            System.out.println("Desea guardar algun otro alumno? (S/N): ");
            opcion = sc.nextLine();
        }while (opcion.equalsIgnoreCase("S"));
        
        servicio.notaFinal();
    }
}
