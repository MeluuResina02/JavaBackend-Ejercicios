/*
  * a = 1, b = 2, c = 1 (tiene una única solución)
  * a = 2, b = -7, c = 3 (tiene dos soluciones)
  * a = 1, b = 1, c = 2 (no tiene soluciones reales)
 */
package ejerex1_raicesg8;

import ServicioRaices.ServicioR;

public class Ejer1Raices {

    public static void main(String[] args) {
        ServicioR num = new ServicioR();
        
        num.valores();
        num.calcular();
    }
    
}
