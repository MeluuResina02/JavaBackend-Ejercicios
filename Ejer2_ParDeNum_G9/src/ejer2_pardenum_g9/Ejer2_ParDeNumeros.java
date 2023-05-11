/*
 * To
 */
package ejer2_pardenum_g9;

import ParDeNum_Servicio.Servicio;

public class Ejer2_ParDeNumeros {

    public static void main(String[] args) {
       Servicio service = new Servicio();
        
        service.mostrarValores();
        System.out.println("El mayor valor es: " + service.devolverMayor());
        System.out.println("La potencia del mayor valor elevado al menor es: " + service.calcularPotencia());
        System.out.println("La raíz cuadrada del menor de los dos valores es: " + service.devolverRaiz());
    }
    
}
