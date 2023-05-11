// Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, 
// Título, Autor, Número de páginas, y un constructor con todos los atributos 
// pasados por parámetro y un constructor vacío. Crear un método para cargar un 
// libro pidiendo los datos al usuario y luego informar mediante otro método el 
// número de ISBN, el título, el autor del libro y el número de páginas.

package ejerlibro;
 
import Libro.Libro;


public class EjerLibro {

    public static void main(String[] args) {
       
        Libro lUno = new Libro();
        
        lUno.cargarLibro();
        
        System.out.println("El Numero de ISB es: " + lUno.ISBN );
        
        System.out.println("El autor es: " + lUno.autor );
        
        System.out.println("El titulo es: " + lUno.titulo );
        
        System.out.println("Numero de paginas: " + lUno.numPaginas );
        
        //System.out.println("El libro es: \n " + lUno.autor + "\n" + lUno.titulo + "\n" + lUno.ISBN + "\n" + lUno.numPaginas );
    }
    
}
