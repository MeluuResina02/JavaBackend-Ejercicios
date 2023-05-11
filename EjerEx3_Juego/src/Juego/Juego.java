/*
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores 
jugar un juego de adivinanza de números. El primer jugador elige un número y el segundo jugador
intenta adivinarlo. El segundo jugador tiene un número limitado de intentos y recibe una pista 
de "más alto" o "más bajo" después de cada intento. El juego termina cuando el segundo jugador 
adivina el número o se queda sin intentos. Registra el número de intentos necesarios para adivinar 
el número y el número de veces que cada jugador ha ganado.
 */
package Juego;

import java.awt.AWTException;
import java.util.Scanner;

public class Juego {
    private int adivinarNum; //el número que el primer jugador elige y que el segundo jugador debe adivinar.
    
    private int intenTotales; //número máximo de intentos que el segundo jugador tiene para adivinar el número.
    
    private int intenJugador; //el número de intentos que el segundo jugador ha realizado hasta el momento.
    
    private int victoriaJugador1; //número de veces que el primer jugador ha ganado.
    
    private int victoriaJugador2; //número de veces que el segundo jugador ha ganado.
    
    public Juego() {
        victoriaJugador1 = 0;
        victoriaJugador2 = 0;
    }
    
    public void iniciarJuego() throws AWTException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jugador 1, elige un número:");
        adivinarNum = scanner.nextInt();
        
        intenTotales = 5;
        
        intenJugador = 0;
        
        while(intenJugador < intenTotales){
            System.out.println("Jugador 2, adivina el número:");
            int adivinanza = scanner.nextInt();
            
            if (adivinanza == adivinarNum){
                System.out.println("¡Correcto! Has adivinado el número en " + (intenJugador + 1) + " intentos." + "El numero era: " + adivinarNum );
                
                victoriaJugador2++;
                
                return;
            }
            
            if(adivinanza < adivinarNum){
                System.out.println("El número es más alto ");
            }else {
                System.out.println("El número es más bajo");
            }
            
            intenJugador++;
            
        }
        
        System.out.println("Te has quedado sin intentos. El número era " + adivinarNum + ".");
    }

    public int getVictoriaJugador1() {
        return victoriaJugador1;
    }

    public int getVictoriaJugador2() {
        return victoriaJugador2;
    }
    
}
