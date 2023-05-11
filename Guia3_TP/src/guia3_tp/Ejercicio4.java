/*
 *Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase 
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla 
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la funcion Substring y equals() de Java.

 */
package guia3_tp;

import java.util.Scanner;

/**
 *
 * @author max_m
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra");
        
        String palabra = leer.next(); 
        
        String letra = palabra.substring(0,1);
        
        if (letra.equals("A")||letra.equals("a")){
            
            System.out.println("Correcto");
        }
        
        else{
            System.out.println("Incorrecto");
        } 
            
       
    }
    
}
