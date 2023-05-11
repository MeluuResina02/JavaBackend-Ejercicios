/*
 *1. Calcular y mostrar el promedio de notas de todo el curso
 *2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
  nota mayor al promedio del curso
 *3. Por último, deberemos mostrar todos los estudiantes con una nota
  mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];
 */
package ServicioEstudiante;

import Estudiante.Estudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author melani
 */
public class Servicio {
    public double calcularPromedio(Estudiante[] estudiantes){
        double sumaNotas = 0.0;
        for(Estudiante estudiante : estudiantes){
           sumaNotas += estudiante.getNota();
        }
        return sumaNotas / estudiantes.length;
    }
    
    public String[] obtenerNombresArribaPromedio(Estudiante[] estudiantes, double promedioNotas){
        List<String> nombresArribaPromedio = new ArrayList<String>();
        for (Estudiante estudiante : estudiantes){
            if (estudiante.getNota() > promedioNotas){
                nombresArribaPromedio.add(estudiante.getNombre());
            }
        }
        return nombresArribaPromedio.toArray(new String[nombresArribaPromedio.size()]);
    }
}
