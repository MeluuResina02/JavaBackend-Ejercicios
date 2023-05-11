/*
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado 
en función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado 
tiene más de 30 años o del 5% si tiene menos de 30 años..
 */
package ejerex5_empleadog7;

import Empleado.Empleado;

public class EjerEmpleado {

    public static void main(String[] args) {
        Empleado salario = new Empleado("Melani" , 32 , 35000); //se puede modificar edad y salario.
        
        salario.calcularAumento();
        System.out.println("Su aumento es: " + salario.getSalario());
        
    }
    
}
