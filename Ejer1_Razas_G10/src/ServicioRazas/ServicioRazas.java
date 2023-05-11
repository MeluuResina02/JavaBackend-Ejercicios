/*
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList..
 */
package ServicioRazas;

import EntidadesRaza.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author melani
 */
public class ServicioRazas {
    private ArrayList<Perro> perros = new ArrayList<>();
    
    public void agregarPerro(){
        Scanner sc = new Scanner (System.in);
        String raza;
        boolean continuar = true;
        do{
            System.out.println("Ingrese la raza de perro: ");
            raza = sc.nextLine();
            perros.add(new Perro(raza));
            System.out.println("¿Desea ingresar otro perro? (S/N): ");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("N")){
                continuar = false;
            }
        }while (continuar);
    }
    
    public void mostrarPerros(){
        System.out.println("Perros guardados: ");
        for (Perro perro : perros){
            System.out.println(perro.getRaza());
        }
    }
}
