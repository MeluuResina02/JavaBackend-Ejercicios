/*
 *Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" 
que calcule y devuelva el área del rectángulo. Luego crea un objeto "rectangulo1" 
de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.
 */
package ejerex6_rectangulog7;

import Rectangulo.Rectangulo;

public class EjerRectangulo {

    public static void main(String[] args) {
       Rectangulo rect = new Rectangulo(6,8);
       
       System.out.println("El área del rectangulo es: " + rect.calcularArea());
       
    }
    
}
