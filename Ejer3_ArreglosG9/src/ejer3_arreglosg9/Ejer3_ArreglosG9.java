/*
 * Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales
 * En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
 */
package ejer3_arreglosg9;

import Servicio.Servicio;

public class Ejer3_ArreglosG9 {

    public static void main(String[] args) {
      double[] arregloA = new double[50];
      double[] arregloB = new double[20];
      
      Servicio servi = new Servicio();
      
      servi.inicializarA(arregloA);
      
      servi.mostrar(arregloA);
      
      servi.ordenar(arregloA);
      
      servi.inicializarB(arregloA, arregloB);
      
      System.out.println("Arreglo A ordenado: ");
      servi.mostrar(arregloA);
      
      System.out.println("Arreglo B inicializado");
      servi.mostrar(arregloB);
    }
}
