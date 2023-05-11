/*
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un 
método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package ejerex4_cuentag7;

import Cuenta.Cuenta;

public class EjerCuenta {

    public static void main(String[] args) {
        Cuenta dinero = new Cuenta(10000, "Melani");
        
        dinero.retirarDinero(2500);
        
        System.out.println("Saldo restante: " + dinero.getSaldo());
    }
    
}
