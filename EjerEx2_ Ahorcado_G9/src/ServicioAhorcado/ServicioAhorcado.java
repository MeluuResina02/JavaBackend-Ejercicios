/*
 *Definir los siguientes métodos en AhorcadoService:
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario,
pone la longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector, 
letra por letra, quedando cada letra de la palabra en un índice del vector. Y también, guarda la cantidad 
de jugadas máximas y el valor que ingresó el usuario.
Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el 
vector.length.
Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es 
parte de la palabra o no. También informará si la letra estaba o no.
Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido
encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la 
letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e 
informará cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará 
en el main.
 */
package ServicioAhorcado;

import EntidadesAhorcado.Ahorcado;
import java.util.Scanner;

public class ServicioAhorcado {
    private Ahorcado ahorcado;
    public Scanner scanner;
     
    public ServicioAhorcado(){
        scanner = new Scanner(System.in);
    }
    
    public void crearJuego(){
        System.out.println("Ingrese la palabra a buscar: ");
        String palabra = scanner.nextLine();
        System.out.println("Ingrese la cantidad de jugadas máximas");
        int oportunidades = scanner.nextInt();
        scanner.hasNextLine();
        ahorcado = new Ahorcado(palabra, oportunidades);
        System.out.println("La palabra tiene " + ahorcado.getLongitud() + " letras.");
    }
    
    public void longitud(){
        System.out.println("La palabra tiene " + ahorcado.getLongitud() + " letras.");
    }
    
    public void buscar(){
        System.out.println("Ingrese una letra: ");
        char letra = scanner.nextLine().toLowerCase().charAt(0);
        boolean encontrado = ahorcado.buscar(letra);
        if (encontrado){
            System.out.println("La palabra pertenece a la palabra.");
        }else{
            System.out.println("La letra no pertenece a la palabra.");
        }
        int[] encontradasFaltantes = ahorcado.letrasEncontradas(letra);
        System.out.println("Número de letras (encontradas, faltantes): ( " + encontradasFaltantes[0] + "," + encontradasFaltantes[1] + ")");
        System.out.println("Número de oportunidades restantes: " + ahorcado.getOportunidadesRestantes());
    }
    
    public void encontradas(){
        System.out.println("Ingrese una letra: ");
        char letra = scanner.nextLine().toLowerCase().charAt(0);
        int[] encontradasFaltantes = ahorcado.letrasEncontradas(letra);
        System.out.println("Número de letras (encontradas, faltantes): ( " + encontradasFaltantes[1] + ")");
        boolean encontrado = ahorcado.buscar(letra);
    }
}
