/*
 * Implementar un programa que le pida dos números enteros al usuario y 
    determine si ambos o alguno de ellos es mayor a 25.
 */
package ejemplosguia;

import java.util.Scanner;

/**
 *
 * @author max_m
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros enteros");
        int num;
        System.out.println("Ingrese el primer número");
        Scanner leer = new Scanner(System.in);
        
        int num2 = 0;
        System.out.println("Ingrese el segundo número");
        Scanner number = new Scanner(System.in);
        
        num = number.nextInt();
        
        if (num < 25 && num2 <25);
        System.out.println("Ambos numeros son menores que 25");
       
        if (num > 25 && num2 >25);
        System.out.println("Ambos numeros son mayores a 25");
        
    }
    
}
