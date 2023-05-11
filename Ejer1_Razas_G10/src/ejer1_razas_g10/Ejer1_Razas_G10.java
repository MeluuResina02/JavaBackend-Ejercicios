/*
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package ejer1_razas_g10;

import ServicioRazas.ServicioRazas;

/**
 *
 * @author melani
 */
public class Ejer1_Razas_G10 {

    public static void main(String[] args) {
        ServicioRazas perroServicio = new ServicioRazas();
        perroServicio.agregarPerro();
        perroServicio.mostrarPerros();
    } 
}
