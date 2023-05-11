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
package ServicioAlumnos;

import EntidadesAlumnos.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author melani
 */
public class ServicioAlumno {
    private List<Alumno> listaAlumnos;
    
    public ServicioAlumno(){
        listaAlumnos = new ArrayList<>();
    }
    
    public void agregarAlumno(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = sc.nextLine();
        
        List<Integer> notas = new ArrayList<>();
        for(int i = 1; i <= 3; i++){
            System.out.println("Ingrese la nota " + i + " del alumno: ");
            notas.add(sc.nextInt());
        }
        sc.nextLine();
        
        Alumno alumno = new Alumno(nombre, notas);
        listaAlumnos.add(alumno);
        
        System.out.println("Alumno agregado con exito");
    }
    
    public void notaFinal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno para cargar su nota final: ");
        String nombre = sc.next();
        
        for(Alumno alumno : listaAlumnos){
            if(alumno.getNombre().equals(nombre)){
               List<Integer> notas = alumno.getNotas();
               int suma = 0;
               for(int nota : notas){
                   suma +=  nota;
               }
               double promedio = (double) suma / notas.size();
               System.out.println("La nota final de " + nombre + " es: " + promedio);
               return;
            }
        }
        System.out.println("No se encontró el alumno.");
    }
}
