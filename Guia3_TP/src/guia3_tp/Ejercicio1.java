
import java.util.Scanner;

/*
 * Crear un programa que dado un número determine si es par o impar.
.*/
 
//package guia3_tp;

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            
            if(numero % 2 == 0) {
                System.out.println(numero + " es un número par");
            } else {
                System.out.println(numero + " es un número impar");
            }
        }
     
    }
    
}
