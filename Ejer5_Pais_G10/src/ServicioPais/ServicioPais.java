/*
 * Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
 */
package ServicioPais;

import EntidadesPais.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author melani
 */
public class ServicioPais {
    private Set<Pais> paises;
    
    public ServicioPais(){
        this.paises = new HashSet<>();
    }
    
    public void agregarPais(String nombrePais){
        Pais nuevoPais = new Pais(nombrePais);
        boolean agregado = this.paises.add(nuevoPais);
        if(!agregado){
            System.out.println("El país ya ha sido agregado");
        }
    }
    
    public void mostrarPaisesOrdenados(){
        List<Pais> paisesOrdenados = new ArrayList<>(this.paises);
        Collections.sort(paisesOrdenados, Comparator.comparing(Pais::getNombre, String.CASE_INSENSITIVE_ORDER));
        
        System.out.println("Paises ingresados (ordenados alfabéticamente): ");
        for(Pais pais : paisesOrdenados){
            System.out.println(pais);
        }
    }
    
    public boolean eliminarPais(String nombrePais){
        Pais paisEliminado = new Pais(nombrePais);
        return this.paises.remove(paisEliminado);
    }
}
