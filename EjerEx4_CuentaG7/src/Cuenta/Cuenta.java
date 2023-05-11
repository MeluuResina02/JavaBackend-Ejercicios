/*
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un 
método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package Cuenta;

public class Cuenta {
    private double saldo;
    private String titular; 

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public void retirarDinero(double cantidad){
        if(cantidad > saldo){
        System.out.println("No hay suficiente saldo en la cuenta");
        }else{
        saldo -= cantidad;
        System.out.println("Se ha retirado $" + cantidad + " de la cuenta.");
    }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        
    }
    
    
}
