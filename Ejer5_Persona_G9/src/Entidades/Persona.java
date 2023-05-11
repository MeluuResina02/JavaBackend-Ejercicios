/*
 * Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha
 * de nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. 
 */
package Entidades;

import java.util.Date;

public class Persona {
    private String nombre;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date nacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getfechaNacimiento() {
        return fechaNacimiento;
    }

    public void setfechaNacimiento(Date nacimiento) {
        this.fechaNacimiento = nacimiento;
    }
}
