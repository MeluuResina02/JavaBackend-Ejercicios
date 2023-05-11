/*
 * Este código primero crea una instancia de ServicioPelicula, luego solicita al usuario que ingrese 
los datos de las películas hasta que el usuario decida no agregar más.

Luego llama a los métodos de ServicioPelicula para mostrar las películas, filtrar y ordenar la lista de
películas según los criterios especificados. Finalmente, el programa termina.
 */
package ejer4_cine_g10;

import ServicioCIne.ServicioCine;
import java.util.Scanner;

/**
 *
 * @author melani
 */
public class Ejer4_Cine_G10 {

    public static void main(String[] args) {
        ServicioCine servicio = new ServicioCine();
        Scanner scanner = new Scanner(System.in);
        boolean seguirAgregando = true;
        
        while(seguirAgregando){
            servicio.agregarPelicula();
            System.out.println("¿Desea agregar otra película? (S/N): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("S")){
                seguirAgregando = false;
            }
        }
        
        System.out.println("\n Todas las películas: ");
        servicio.mostrarTodasPeliculas();
        
        System.out.println("\n -----------------------");
        
        System.out.println("\n Películas con duración de más de una hora: ");
        servicio.mostrarPeliculasMasDe1Hora();
        
        System.out.println("\n -----------------------");
        
        System.out.println("\n Películas ordenadas por duración (de mayor a menor): ");
        servicio.ordenarPeliculasPorDuracionDescen();
        
        System.out.println("\n ------------------------");
        
        System.out.println("\n Películas ordenadas por duración (de menor a mayor): ");
        servicio.ordenarPeliculasPorDuracionAscen();
        
        System.out.println("\n ------------------------");
        
        System.out.println("\n Películas ordenadas por título: ");
        servicio.ordenarPeliculasPorTitulo();
        
        System.out.println("\n ------------------------");
        
        System.out.println("\n Películas ordenadas por director: ");
        servicio.ordenarPeliculasPorDirector();
        
        System.out.println("\n ------------------------");
    }
}
