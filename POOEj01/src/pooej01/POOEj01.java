
package pooej01;

import Entidad.Persona;
import java.util.Scanner;

public class POOEj01 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Persona p1 = new Persona();
      
        p1.nombre = "Melani"; 
        
        p1.apellido = "Resina";
        
        p1.edad = 20;
        
        p1.apodo = "Meluu";
        
        p1.date = "20/09/02";
        
       System.out.println(p1.apodo + " - " + p1.edad + " - " + p1.date);

    }
    
}
