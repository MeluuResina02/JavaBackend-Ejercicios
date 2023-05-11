/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package Claseuno;

import java.util.Scanner;

/**
 *
 * @author m
 */
public class Ejercio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = leer.next();
        System.out.println("Bienvenida/o " + nombre);
    }
}
    

