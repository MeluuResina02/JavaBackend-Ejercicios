/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo 
lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de 
un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca
el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se 
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas 
recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones 
de Java Substring(), Length(), equals().
 */
package guia3_tp;

import java.util.Scanner;

public class Ejercicio7 {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String input;
        int correctCount = 0;
        int incorrectCount = 0;

        do {
            System.out.print("Ingrese una cadena: ");
            input = scanner.nextLine();
            if (input.equals("&&&&&")) {
                break;
            }
            if (input.length() != 5 || !input.startsWith("X") || !input.endsWith("O")) {
                System.out.println("Cadena incorrecta.");
                incorrectCount++;
            } else {
                System.out.println("Cadena correcta.");
                correctCount++;
            }
        } while (true);

        System.out.println("Lecturas correctas: " + correctCount);
        System.out.println("Lecturas incorrectas: " + incorrectCount);
    
    }
    
}
