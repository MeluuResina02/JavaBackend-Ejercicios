/*
 * Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: 
numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros,
getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la 
cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package CuentaBancaria_Servicio;

import CuentaBancaria.CuentaBancaria;
import java.util.Scanner;

public class Servicio {
    Scanner leer = new Scanner(System.in);
    
    public CuentaBancaria crearCuenta(){
        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = leer.nextInt();
        
        System.out.print("Igrese el DNI del cliente: ");
        long dniCliente = leer.nextLong();
        
        System.out.print("Ingrese la cantidad del saldo: ");
        double saldoActual = leer.nextDouble();
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
        return cuenta;
    }    
    
    public void ingresar(CuentaBancaria numeroCuenta){
        double ingreso;
        System.out.println("Cuanto dinero desea ingresar?");
        ingreso = leer.nextInt();
        numeroCuenta.setSaldoActual(numeroCuenta.getSaldoActual() + ingreso);
    }
    
    public void retirar (CuentaBancaria numeroCuenta){
        double retiro;
        System.out.println("Cuanto dinero desea retirar?");
        retiro = leer.nextDouble();
        double balance = numeroCuenta.getSaldoActual();
        if (balance < retiro) {
            System.out.println("No tiene suficiente saldo");
            numeroCuenta.setSaldoActual(0);
        } else {
            numeroCuenta.setSaldoActual(numeroCuenta.getSaldoActual() - retiro);
        }
    }
    
    public void extraccionRapida(CuentaBancaria numeroCuenta){
         System.out.println("Extracción rápida (hasta 20%). Ingrese la cantidad a retirar");
        double extrac = leer.nextDouble();
        if (extrac < (numeroCuenta.getSaldoActual() * 0.2)) {
            numeroCuenta.setSaldoActual(numeroCuenta.getSaldoActual() - extrac);
            System.out.println("Su saldo actual es de: " + numeroCuenta.getSaldoActual());
        } else {
            System.out.println("No se puede retirar la cantidad ingresada");
        }
    }
    
   public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("El saldo actual de la cuenta es: " + cuenta.getSaldoActual());
    }
        
    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println("Numero de cuenta" + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente " + cuenta.getDniCliente());
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }
}       

