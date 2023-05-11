/*
 * Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package ejer5_pais_g10;

import ServicioPais.ServicioPais;
import java.util.Scanner;

/**
 *
 * @author melani
 */
public class Ejer5_Pais_G10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicioPais paisServicio = new ServicioPais();
        
        // Pedir países hasta que el usuario decida salir
        boolean continuar = true;
        while(continuar){
            System.out.println("Ingrese un país:");
            String nombrePais = scanner.nextLine();
            paisServicio.agregarPais(nombrePais);
            
            System.out.println("Desea ingresar otro país? (S/N): ");
            String respuesta = scanner.nextLine();
            continuar = respuesta.equalsIgnoreCase("S");
        }
        
        // Mostrar todos los países ingresados, ordenados alfabéticamente
        paisServicio.mostrarPaisesOrdenados();
        
        // Pedir al usuario un país para eliminarlo del conjunto
        System.out.println("Ingrese un país para eliminar: ");
        String nombrePais = scanner.nextLine();
        boolean eliminado = paisServicio.eliminarPais(nombrePais);
        if(eliminado){
            System.out.println("País eliminado exitosamente. ");
            paisServicio.mostrarPaisesOrdenados();
        }else{
            System.out.println("El país ingresado no está en la lista.");
        }
    }
}
