/*
 * Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
 */
package ejerex2_.ahorcado_g9;

import EntidadesAhorcado.Ahorcado;
import ServicioAhorcado.ServicioAhorcado;

public class EjerEx2_Ahorcado_G9 {

    public static void main(String[] args) {
      Ahorcado ahorcado = new Ahorcado();
      ServicioAhorcado ahorcadoService = new ServicioAhorcado();
      
      ahorcadoService.crearJuego();
      
      while (!ahorcado.juegoTerminado()){
          System.out.println("Ingrese una letra: ");
          char letra = ahorcadoService.scanner.nextLine().toLowerCase().charAt(0);
          
          if (ahorcado.buscar(letra)){
            System.out.println("La letra pertenece a la palabra.");
          }else{
            System.out.println("La letra no pertenece a la palabra");
          }
          int[] encontradasFaltantes = ahorcado.letrasEncontradas(letra);
          System.out.println("Número de letras (encontradas, faltantes): (" + encontradasFaltantes[0] + ", " + encontradasFaltantes[1] + ")");
          System.out.println("Número de oportunidades restantes: " + ahorcado.getOportunidadesRestantes());
          System.out.println("----------------------------------------------");
      }
      if (ahorcado.getOportunidadesRestantes() == 0){
          System.out.println("Lo sentimos, no hay mas oportunidades");
      }else{
          System.out.println("¡Felicitaciones, ha ganado el juego!");
      }
    }
    
}
