/*
 * Implementar un programa que le pida dos números enteros al usuario y determine si 
  ambos o alguno de ellos es mayor a 25.
 */
package ejemplosguia;

import java.util.Scanner;

/**
 *
 * @author max_m
 */
public class EjemplosGuia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner (System.in);
        //se crea una variable cadena (string) que se utiliza para leer datos del usuario
        String nombre;
        //muestra un mensaje por pantalla
        System.out.println("Ingresa tu nombre");
        //leemos el nombre de la persona en la variable nombre
        nombre = leer.next();
        //mostramos por consola un saludo personalizado
        System.out.println("Hola mundo, Soy " + nombre + " y estoy programando en java");
        
    }
    
}
