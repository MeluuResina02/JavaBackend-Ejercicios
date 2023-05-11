/*
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package razaperros_g10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author melani
 */
public class RazaPerros_G10 {

    public static void main(String[] args) {
        ArrayList<String> razasPerros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String razaPerro;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Introduzca una raza de perro: ");
            razaPerro = scanner.nextLine();
            razasPerros.add(razaPerro);

            System.out.print("¿Quiere guardar otro perro? (S/N): ");
            String respuesta = scanner.nextLine().toUpperCase();
            while (!respuesta.equals("S") && !respuesta.equals("N")) {
                System.out.print("Respuesta inválida. Introduzca S o N: ");
                respuesta = scanner.nextLine().toUpperCase();
            }
            if (respuesta.equals("N")) {
                continuar = false;
            }
        }

        System.out.println("Perros guardados: ");
        for (String raza : razasPerros) {
            System.out.println(raza);
        }
    }
}
