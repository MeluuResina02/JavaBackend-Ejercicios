/*
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor 
de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales 
de cada variable. Utilizar sólo una variable auxiliar.

 */
package EjerExtrasG3;

import java.util.Scanner;



/**
 *
 * @author max_m
 */
public class EjerEx2 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
      
        int A, B, C, D, X;
        A = 5;
        B = 10;
        C = 15;
        D = 20;
        System.out.println("A: " + A + " B: " + B + " C: " + C + " D: " + D);

        X = B;
        B = C;
        C = A;
        A = D;
        D = X;
               
    }
    
}
