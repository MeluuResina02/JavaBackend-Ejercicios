/*
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package ServicioPerro;

import EntidadesPerro.Entidades;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author melani
 */
public class ServicioPerro {
    private ArrayList<Entidades> perros = new ArrayList<>();
    
    public void agregarPerro(){
        Scanner sc = new Scanner(System.in);
        String raza;
        boolean continuar = true;
        do{
            System.out.println("Ingrese la raza del perro: ");
            raza = sc.nextLine();
            perros.add(new Entidades(raza));
            System.out.println("Desea inngresar otro perro? (s/n) : ");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("n")){
                continuar = false;
            }
        }while (continuar);
    }
    
    public void mostrarPerros(){
        System.out.println("Perros guardados: ");
        for (Entidades perro : perros){
            System.out.println(perro.getRaza());
        }
    }
    
    public void eliminarPerro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la raza de perro que desea eliminar: ");
        String raza = sc.nextLine();
        Iterator<Entidades> iterator = perros.iterator();
        boolean encontrado = false;
        while (iterator.hasNext()){
            Entidades perro = iterator.next();
            if (perro.getRaza().equalsIgnoreCase(raza)){
                iterator.remove();
                encontrado = true;
            }
        }
        if(encontrado) {
            System.out.println("El perro fue eliminado");
        }else{
            System.out.println("El perro no fue encontrado");
        } 
        ordenarPerros();
        mostrarPerros();
    }
    
    private void ordenarPerros() {
        Collections.sort(perros, (p1, p2) -> p1.getRaza().compareToIgnoreCase(p2.getRaza()));
    }
}
