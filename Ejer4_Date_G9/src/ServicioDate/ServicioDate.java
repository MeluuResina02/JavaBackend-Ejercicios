/*
 * Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por
parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. Ejemplo fecha: 
Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío
de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años 
entre una y otra (edad del usuario).
 */
package ServicioDate;

import java.util.Date;
import java.util.Scanner;

public class ServicioDate {
    public Date fechaDeNacimiento(){
        Scanner scanner = new Scanner(System.in);
       System.out.println("Introduzca su fecha de nacimiento dd/mm/aaaa) : ");
       String fechaString = scanner.nextLine();
       String[] fechaArray = fechaString.split("/");
       int dia = Integer.parseInt(fechaArray[0]);
       int mes = Integer.parseInt(fechaArray[1]) - 1;
       int anio = Integer.parseInt(fechaArray[2]) - 1900;
       return new Date(anio, mes, dia);
    }
    
    public Date fechaActual(){
        return new Date();
    }
    
    public int diferencia(Date fecha1, Date fecha2){
        long diferenciaEnMiliSegundos = fecha2.getTime() - fecha1.getTime();
        long miliSegundosEnUnAnio = 1000L * 60L * 60L * 24L * 365L;
        return (int) (diferenciaEnMiliSegundos / miliSegundosEnUnAnio);
    }
}
