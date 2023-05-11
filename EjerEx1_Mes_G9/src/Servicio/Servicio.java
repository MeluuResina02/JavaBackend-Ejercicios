/*
 * To.
 */
package Servicio;

import Entidad.MesesDelAño;
import java.util.Scanner;

public class Servicio {
    private Scanner scanner = new Scanner (System.in);
    private MesesDelAño mesesDelAño = new MesesDelAño();
    
    public void jugar(){
     System.out.println("Adivina el mes secreto. Introduzca el nombre del mes en minúsculas: ");
     String mes = scanner.nextLine();
     while (!mesesDelAño.adivinarMes(mes)){
         mes = scanner.nextLine();
     }
    }
}
