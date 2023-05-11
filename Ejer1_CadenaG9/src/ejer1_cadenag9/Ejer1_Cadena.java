/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1_cadenag9;

import CadenaServicio.CadenaServicio;
import EntidadesCadena.Cadena;
import java.util.Scanner;

public class Ejer1_Cadena {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese una frase: ");
       String frase = scanner.nextLine();
       
       Cadena cadena = new Cadena(frase);
       
       CadenaServicio servicio = new CadenaServicio(cadena);
       
       System.out.println("La frase ingresada tiene " + servicio.mostarVocales() + " vocales. ");
       
       System.out.print("La frase invertida es: ");
       servicio.invertirFrase();
        
       System.out.print("Ingrese una letra para contar cuántas veces se repite en la frase: ");
       char letra = scanner.nextLine().charAt(0);
       System.out.println("La letra '" + letra + "' se repite " + servicio.vecesRepetido(letra) + " veces.");
       
       System.out.print("Ingrese otra frase para comparar su longitud: ");
       String otraFrase = scanner.nextLine();
       int resultado = servicio.compararLongitud(otraFrase);
       if (resultado < 0) {
            System.out.println("La frase ingresada es más larga que la otra.");
       } else if (resultado > 0) {
            System.out.println("La frase ingresada es más corta que la otra.");
       } else {
            System.out.println("Las frases tienen la misma longitud.");
       }
        
       System.out.print("Ingrese otra frase para unirla a la anterior: ");
       String union = scanner.nextLine();
       servicio.unirFrases(union);
       
       System.out.print("Ingrese una letra para cambiar todas las 'a' de la frase: ");
       char letraReemplazo = scanner.nextLine().charAt(0);
       servicio.reemplazar('a', letraReemplazo);
       
       System.out.print("Ingrese una letra para verificar si esta contenida en la frase: ");
       char letraBusqueda = scanner.nextLine().charAt(0);
       if (servicio.contiene(letraBusqueda)){
           System.out.println("La frase contiene la letra ' " + letraBusqueda + " '.");
       }else{
           System.out.println("La frase no contiene la letra ' " + letraBusqueda + " '. ");
       }
       
    }
}
