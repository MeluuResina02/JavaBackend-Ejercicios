/*
 * Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos 
capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y cantidadActual 
(la cantidad actual de café que hay en la cafetera). Agregar constructor vacío y con parámetros 
así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza 
y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café 
“no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si se 
llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se 
añade a la cafetera la cantidad de café indicada.
 */
package Servicio;

import EntidadCafetera.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {
    Scanner leer = new Scanner(System.in);
    
    public void llenarCafetera(Cafetera cafe){
        System.out.println("Cafetera llena..."); 
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
    }
    
    public int servirTaza(Cafetera cafe){
        System.out.println("Ingrese la capacidad de la taza: ");
        int taza = leer.nextInt();
        System.out.println("-Llenando su taza, aguarde... ");
        cafe.setCantidadActual(cafe.getCapacidadMaxima()-taza);
        return taza;
    }
    
    public void vaciarCafetera(Cafetera cafe){
        System.out.println("-Vanciando la cafetera, aguarde... ");
        cafe.setCantidadActual(0);
    }
    
    public int agregarCafe(Cafetera cafe){
        int cantiCafe;
        System.out.println("La capacidad actual es: " + cafe.getCantidadActual());
        System.out.println("Ingrese la cantidad que va a agregar de cafe: ");
        cantiCafe = leer.nextInt();
        
        if(cafe.getCantidadActual() + cantiCafe > cafe.getCapacidadMaxima()){
            System.out.println("Se ha excedido la cantidad maxima por: " + (cafe.getCantidadActual()+ cantiCafe - cafe.getCapacidadMaxima()));
        } else {
            System.out.println("Se agrego el cafe, capacidad actual : ");
            cafe.setCantidadActual(cafe.getCantidadActual() + cantiCafe); 
        }   
        return cafe.getCantidadActual();
        }
    }

