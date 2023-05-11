/*
 * Escribir un programa que lea un número enteros por teclado y muestre por pantalla el doble, 
el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

 */
package Claseuno;
import java.util.Scanner;
/**
 *
 * @author max_m
 */
public class Ejercicio5 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);   
    System.out.println("Ingrese un número entero");
    int numero = leer.nextInt ();
    double raizCuadrada = Math.sqrt(numero);
    System.out.println("El doble de " + numero + " es: " + (numero * 2));
    System.out.println("El triple de " + numero + " es: " + (numero * 3));
        
    System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
            
            
    }
    
    
}
