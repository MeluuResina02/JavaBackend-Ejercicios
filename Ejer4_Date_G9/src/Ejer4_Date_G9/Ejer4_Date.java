/*
 * Pedimos al usuario la fecha de nacimiento.
 * Creamos un objeto Date con la fecha actual.
 * Calculamos la diferencia en años entre ambas fechas.
 * Mostramos la edad del usuario.
 */
package Ejer4_Date_G9;

import ServicioDate.ServicioDate;
import java.util.Date;

public class Ejer4_Date {

    public static void main(String[] args) {
        ServicioDate fechaService = new ServicioDate();
        
        Date fechaNacimiento = fechaService.fechaDeNacimiento();
        
        Date fechaActual = fechaService.fechaActual();

        int edad = fechaService.diferencia(fechaNacimiento, fechaActual);
        
        System.out.println("Tu edad es: " + edad + " años");
    }   
}
