package Libro;


import java.util.Scanner;

// Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, 
// Título, Autor, Número de páginas, y un constructor con todos los atributos 
// pasados por parámetro y un constructor vacío. Crear un método para cargar un 
// libro pidiendo los datos al usuario y luego informar mediante otro método el 
// número de ISBN, el título, el autor del libro y el número de páginas.

public class Libro {
   
    public int ISBN; 
    
    public String titulo;
    
    public String autor;
    
    public int numPaginas;
   
    public Libro() {
    }
    
    /**
     *
     * @param ISBN
     * @param titulo
     * @param autor
     * @param numPaginas
     */

    public Libro(int ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    public void cargarLibro() {
        
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingrese ISBN: ");
        
        ISBN = leer.nextInt();
        
        System.out.println("Igrese el titulo del libro: ");
        
        titulo = leer.nextLine();
        
        leer.nextLine();
        
        System.out.println("Ingrese el autor: ");
        
        autor = leer.nextLine();
        
        System.out.println("Ingrese numero de paginas:");
        
        numPaginas = leer.nextInt();
                
        
        
    }
}
