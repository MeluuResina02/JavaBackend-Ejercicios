/*
 * Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la 
siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, 
el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, 
el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla 
las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), 
según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 */
package ServicioRaices;

import EntRaices.Raices;
import java.util.Scanner;

public class ServicioR {
    Raices r = new Raices();
    
     public void valores() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        r.setA(leer.nextInt());
        System.out.println("Ingrese el segundo numero");
        r.setB(leer.nextInt());
        System.out.println("Ingrese el tercer numero");
        r.setC(leer.nextInt());
    }
     
     public double getDiscriminante(){
         return ((r.getB() * r.getB()) - 4 * r.getA() * r.getC());
     }
     
     public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }

    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }
    
    public void obtenerRaices(){
        if (tieneRaices()) {
            double x1 = (-r.getB() + Math.sqrt(getDiscriminante())) / (2 * r.getA());
            double x2 = (-r.getB() - Math.sqrt(getDiscriminante())) / (2 * r.getA());
            System.out.println("Las posibles soluciones son x1 = " + x1 + " y x2 = " + x2);
        } else {
            System.out.println("No tiene soluciones reales");
        }
    }
    
    public void obtenerRaiz(){
        if (tieneRaiz()) {
            double x = -r.getB() / (2 * r.getA());
            System.out.println("La única solución es x = " + x);
        } else {
            System.out.println("No tiene una única solución real");
        }
    }
    
    public void calcular(){
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No tiene soluciones reales");
        }
    }
}
