/*
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores 
jugar un juego de adivinanza de números. El primer jugador elige un número y el segundo jugador
intenta adivinarlo. El segundo jugador tiene un número limitado de intentos y recibe una pista 
de "más alto" o "más bajo" después de cada intento. El juego termina cuando el segundo jugador 
adivina el número o se queda sin intentos. Registra el número de intentos necesarios para adivinar 
el número y el número de veces que cada jugador ha ganado.
 */
package ejerex3_juego;

import Juego.Juego;
import java.awt.AWTException;

public class EjerJuego {

    public static void main(String[] args) throws AWTException {
        Juego j1 = new Juego();
        
        j1.iniciarJuego();
        
        System.out.println("Jugador 1 ha ganado " + j1.getVictoriaJugador1() + " veces");
        System.out.println("Jugador 2 ha ganado " + j1.getVictoriaJugador2() + " veces");
        
    }
    
}
