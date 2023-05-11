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
Método consultarDatos: permitirá mostrar todos los datos de la cuenta
 */
package ejer1_cuentabancariag8;

import CuentaBancaria.CuentaBancaria;
import CuentaBancaria_Servicio.Servicio;
import java.util.Scanner;

public class Ejer1_CuentaBancaria {
    
     public static void main(String[] args) {
         Servicio serv = new Servicio();
         System.out.println("Bienvenido a su banco");
         System.out.println("Para proceder, cree una cuenta: ");
         
         CuentaBancaria cuenta1 = new CuentaBancaria();
         
         Scanner leer = new Scanner(System.in);
         
         System.out.println("OPCION 1 = Crear una cuenta \n"
                 + "OPCION 2 = Ingresar dinero \n"
                 + "OPCION 3 = Retirar dinero \n"
                 + "OPCION 4 = Extraccion rapida \n"
                 + "OPCION 5 = Consultar saldo \n"
                 + "OPCION 6 = Consultar datos  \n"
                 + "OPCION 7 = Salir");
         
         int var;
         do {   
        System.out.println("Elija una opcion : ");
        var = leer.nextInt();       
        switch (var) {
            case 1: 
                serv.crearCuenta();
                 break;
            case 2: 
                serv.ingresar(cuenta1);
                 break;
            case 3:
                serv.retirar(cuenta1);
                 break;
            case 4: 
                serv.extraccionRapida(cuenta1);
                 break;
            case 5:
                serv.consultarSaldo(cuenta1);
                break;
            case 6:
                serv.consultarDatos(cuenta1);
                break;
            case 7:
                System.out.println("Cerrando cuenta... Lo esperamos pronto.");
            } 
         } while (var != 7);
     }
}