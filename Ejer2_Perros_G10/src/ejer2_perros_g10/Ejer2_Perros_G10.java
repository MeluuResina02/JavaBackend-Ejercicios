/*
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package ejer2_perros_g10;

import ServicioPerro.ServicioPerro;

/**
 *
 * @author melani
 */
public class Ejer2_Perros_G10 {

    public static void main(String[] args) {
       ServicioPerro perroServicio = new ServicioPerro();
       perroServicio.agregarPerro();
       perroServicio.mostrarPerros();
       perroServicio.eliminarPerro();
    }
}
