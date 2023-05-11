/*
 * En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package ServicioCIne;

import EntidadesCine.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author melani
 */
public class ServicioCine {
    private ArrayList<Pelicula> listaPeliculas;
    private Scanner scanner;
    
    public ServicioCine(){
        this.listaPeliculas = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    
    public void agregarPelicula(){
        System.out.println("Ingrese el titulo de la película: ");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese el director de la película: ");
        String director = scanner.nextLine();
        System.out.println("Ingrese la duracion de la película en horas: ");
        double duracion = scanner.nextDouble();
        scanner.nextLine();
        
        Pelicula pelicula = new Pelicula(titulo, director, duracion);
        listaPeliculas.add(pelicula);
    }
    
    public void mostrarTodasPeliculas(){
        for(Pelicula pelicula : listaPeliculas){
            System.out.println("[" + pelicula.getTitulo()+ "]" + " -Dirigida por:  " + pelicula.getDirector() + "-Duracion " + pelicula.getDuracion() + " horas: ");
        }
    }
    
    public void mostrarPeliculasMasDe1Hora(){
        for(Pelicula pelicula : listaPeliculas){
            if(pelicula.getDuracion() > 1){
                System.out.println( "[" + pelicula.getTitulo() + "]" + "-Dirigida por: " + pelicula.getDirector() + "-Duracion " + pelicula.getDuracion() + " horas: ");
            }
        }
    }
    
    public void ordenarPeliculasPorDuracionDescen(){
        Comparator<Pelicula> comparador = new Comparator<Pelicula>(){
            @Override
            public int compare(Pelicula p1, Pelicula p2){
                if (p1.getDuracion() < p2.getDuracion()){
                    return 1;
                }else if (p1.getDuracion() > p2.getDuracion()){
                    return -1;
                }else{
                    return 0;
                }
            }
        };
        Collections.sort(listaPeliculas, comparador);
        mostrarTodasPeliculas();
    }
    
    public void ordenarPeliculasPorDuracionAscen(){
        Comparator<Pelicula> comparador = new Comparator<Pelicula>(){
            @Override
            public int compare(Pelicula p1, Pelicula p2){
                if (p1.getDuracion() < p2.getDuracion()){
                    return -1;
                }else if(p1.getDuracion() > p2.getDuracion()){
                    return 1;
                }else{
                    return 0;
                }
            }
        };
        Collections.sort(listaPeliculas, comparador);
        mostrarTodasPeliculas();
    }
    
    public void ordenarPeliculasPorTitulo(){
      Collections.sort(listaPeliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getTitulo().compareToIgnoreCase(p2.getTitulo());
            }
        });
        mostrarTodasPeliculas();
    }
    
    public void ordenarPeliculasPorDirector(){
        Collections.sort(listaPeliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getDirector().compareToIgnoreCase(p2.getDirector());
            }
        });
        mostrarTodasPeliculas();
    }
}
