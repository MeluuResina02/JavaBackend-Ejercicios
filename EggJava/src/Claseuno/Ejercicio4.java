
/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).

/**
 *
 * @author mel
 */

package Claseuno;

import java.util.Scanner;

public class Ejercicio4 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese los grados Celsius");
         int celsius = leer.nextInt();
         double fahrenheit = 32 + (9.0 / 5) * celsius;
         System.out.println("El equivalente en grados Fahrenheit es:" + fahrenheit);
     }
}
