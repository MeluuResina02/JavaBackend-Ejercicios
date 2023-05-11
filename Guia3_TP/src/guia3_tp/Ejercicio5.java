/*
 * Escriba un programa en el cual se ingrese un valor limite positivo, y 
a continuacion solicite números al usuario hasta que la suma de 
los numeros introducidos supere el límite inicial.
 */
package guia3_tp;

import java.util.Scanner;

/**
 *
 * @author max_m
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un límite");
        
        int num = leer.nextInt();
        int num2 = 0;
        
        while (num>num2){
            Scanner numero = new Scanner(System.in);
            
            System.out.println("Ingrese un numero");
            
            int num3 = numero.nextInt();
            
            num2 = num2 + num3;
        } 
    }
    
}
