/*
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package EjerExtrasG3;

import java.util.Scanner;

/**
 *
 * @author max_m
 */
public class EjerEx1 {

    
    public static void main(String[] args) {
        int minutos;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el tiempo en minutos: ");
            minutos = scanner.nextInt();
        }
        
        int horas = minutos / 60;
        int dias = horas / 24;
        horas %= 24;
        
        System.out.println(minutos + " minutos son " + dias + " días y " + horas + " horas.");
    }
    
}
