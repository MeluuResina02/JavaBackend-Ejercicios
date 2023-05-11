/*
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar 
por cero, el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y 
se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por 
cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, 
se hace la división y se devuelve el resultado al main.

 */
package Operacion;

import java.util.Scanner;

public class Operacion {
    private int num1;
    
    private int num2;
   
    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
   
    public Operacion() {
        this.num1 = 0;
        this.num2 = 0;
    }
    
    public int getNum1(){
        return num1;
    }
    
    public void setNum1(){
        this.num1 = num1;
    }
    
    public int getNum2(){
        return num2;
    }
    
    public void setNum2(){
        this.num2 = num2;
        
    }
    
    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        this.num1 = num1;
        this.num2 = num2;
    }
    
     public int sumar() {
        return this.num1 + this.num2;
    }
     
     public int restar() {
        return this.num1 - this.num2;
    }
     
     public int multiplicar() {
        if (this.num2 == 0) {
            System.out.println("Error: No se puede multiplicar por cero");
            return 0;
        } else {
            return this.num1 * this.num2;
        }
    }
     
     public int dividir(){
         if (this.num2 == 0){
             System.out.println("Error: No se puede dividir por cero");
             return 0;
         } else {
             return this.num1 / this.num2;
         }
     }

}
