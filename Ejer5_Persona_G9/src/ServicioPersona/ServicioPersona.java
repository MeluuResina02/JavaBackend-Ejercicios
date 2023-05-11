/*
 * Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar
el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y 
la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que
la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.

 */
package ServicioPersona;

import Entidades.Persona;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ServicioPersona {
    private Scanner sc = new Scanner(System.in);
    
    public ServicioPersona(){
        this.sc = new Scanner(System.in);
    }
    
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la fecha de nacimiento de la persona (dd/mm/aaaa) : ");
        String fechaNacimientoStr = sc.nextLine();
        
        String[] partesFecha = fechaNacimientoStr.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]) - 1; 
        int anio = Integer.parseInt(partesFecha[2]);
        Calendar cal = Calendar.getInstance();
        cal.set(anio, mes, dia);
        Date fechaNacimiento = cal.getTime();
        
        Persona persona = new Persona(nombre, fechaNacimiento);
        return persona;
    }
    
    public int calcularEdad(Date fechaNacimiento){
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.setTime(fechaNacimiento);
        Calendar fechaActual = Calendar.getInstance();
        int edad = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        
        if (fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNac.get(Calendar.DAY_OF_YEAR)){
            edad--; 
        }
        return edad;
    }
    
    public boolean menorQue(Persona persona, int edad){
        Date fechaNacimiento = persona.getfechaNacimiento();
        int edadPersona = calcularEdad(fechaNacimiento);
        return edadPersona < edad;
    }
    
    public void mostrarPersona(Persona persona){
        String nombre = persona.getNombre();
        Date fechaNacimiento = persona.getfechaNacimiento();
        int edad = calcularEdad(fechaNacimiento);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getfechaNacimiento());
        System.out.println("Edad: " + calcularEdad(persona.getfechaNacimiento()));
    }
}
