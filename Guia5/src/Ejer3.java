
import java.util.Scanner;

/*
*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */

/**
 *
 * @author max_m
 */
public class Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] vector;
        int n, digitos, unDigito = 0, dosDigitos = 0, tresDigitos = 0, cuatroDigitos = 0, cincoDigitos = 0;
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        n = leer.nextInt();
        vector = new int[n];
        System.out.println("Ingrese los números a ingresar al vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = leer.nextInt();
        }

        // Contar la cantidad de números de 1, 2, 3, 4 y 5 dígitos
        for (int i = 0; i < n; i++) {
            digitos = String.valueOf(vector[i]).length();
            switch (digitos) {
                case 1:
                    unDigito++;
                    break;
                case 2:
                    dosDigitos++;
                    break;
                case 3:
                    tresDigitos++;
                    break;
                case 4:
                    cuatroDigitos++;
                    break;
                case 5:
                    cincoDigitos++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("Cantidad de números de 1 dígito: " + unDigito);
        System.out.println("Cantidad de números de 2 dígitos: " + dosDigitos);
        System.out.println("Cantidad de números de 3 dígitos: " + tresDigitos);
        System.out.println("Cantidad de números de 4 dígitos: " + cuatroDigitos);
        System.out.println("Cantidad de números de 5 dígitos: " + cincoDigitos);
    }

}
    
