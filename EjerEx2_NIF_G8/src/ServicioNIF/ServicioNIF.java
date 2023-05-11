/*
 * La letra correspondiente al dígito verificador se calculará a traves de un método que funciona 
de la siguiente manera: Para calcular la letra se toma el resto de dividir el número de DNI por 23
(el resultado debe ser un número entre 0 y 22). El método debe buscar en un array (vector) de caracteres
la posición que corresponda al resto de la división para obtener la letra correspondiente. 
La tabla de caracteres es la siguiente:
0-T/1-R/2-W/3-A/4-G/5-M/6-Y/7-F/8-P/9-D/10-X/11-B/12-N/13-J/14-Z/15-S/16-Q/17-V/18-H/19-L/
20-C/21-K/22-E
 */
package ServicioNIF;

import Entidades_NIF.NIF_Ent;
import java.util.Scanner;

public class ServicioNIF {
    char[] VectorLetras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    NIF_Ent dni = new NIF_Ent();
    
    public void crearNIF(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el DNI : ");
        long DNI = leer.nextLong();
        dni.setNumDNI(DNI);
        int resto = (int) DNI % 23;
        char letra = VectorLetras[resto];
        dni.setLetra(letra);  
    }
    
    public void mostrar(){
        System.out.println("DNI: " + dni.getNumDNI() + "-" + dni.getLetra());
    }
}
