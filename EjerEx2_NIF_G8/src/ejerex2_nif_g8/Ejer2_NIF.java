/*
 * 
 */
package ejerex2_nif_g8;

import ServicioNIF.ServicioNIF;
import java.util.Scanner;

public class Ejer2_NIF {

    public static void main(String[] args) {
        ServicioNIF dNI = new ServicioNIF();
        Scanner leer = new Scanner(System.in);
        int var;
        
        System.out.println("OPCION 1 : Cargar DNI \n" 
                + "OPCION 2 : Mostrar DNI \n" 
                + "OPCION 3 : Salir");
        
    do {
            System.out.println("Ingrese la OPCION : ");
            var = leer.nextInt();
            switch (var) {
                case 1:
                    dNI.crearNIF();
                    break;
                case 2:
                    dNI.mostrar();
                    break;
                case 3:
                    System.out.println("Cerrando programa...");
                    break;
                default:
                System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                break;
            }
        } while (var != 3);
    }   
}
