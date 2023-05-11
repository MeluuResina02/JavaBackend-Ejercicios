/*
 * Crear persona
 * Mostrar información de la persona
 * Verificar si la persona es menor que cierta edad
 */
package ejer5_persona_g9;

import Entidades.Persona;
import ServicioPersona.ServicioPersona;

public class Ejer5_Persona_G9 {

    public static void main(String[] args) {
        ServicioPersona personService = new ServicioPersona();
        Persona persona = new Persona();
        
        personService.mostrarPersona(persona);
        
        int edadConsulta = 18;
        boolean esMenor = personService.menorQue(persona, edadConsulta);
        if (esMenor){
            System.out.println("La persona es menor que " + edadConsulta + "años. ");
        }else{
            System.out.println("La persona es mayor que " + edadConsulta + "años.");
        }
 
    }
}
