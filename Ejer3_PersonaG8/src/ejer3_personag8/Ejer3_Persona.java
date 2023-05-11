/*
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso
o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas 
variables(arrays), para después calcular un porcentaje de esas 4 personas cuantas están por debajo 
de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de 
cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.
 */
package ejer3_personag8;

import Entidades_Persona.Persona;
import Servicio.Servicio;


public class Ejer3_Persona {

    public static void main(String[] args) {
     Servicio n1 = new Servicio();
        Persona p1 = n1.crearPersona();
        Persona p2 = n1.crearPersona();
        Persona p3 = n1.crearPersona();
        Persona p4 = n1.crearPersona();
        
        Persona [] Vector = new Persona[4];
        
        Vector [0] = p1;
        Vector [1] = p2;
        Vector [2] = p3;
        Vector [3] = p4;
        
        for (int i = 0; i < 4; i++) {
            Persona p = Vector[i];
            if (n1.esMayorDeEdad(p)){
                System.out.println(n1.getNombre(p) + " : Es Mayor de Edad"  );
            }else{
                System.out.println(n1.getNombre(p) + " Es Menor de Edad");
            }
            switch (n1.calcularIMC(p)) {
                case 1:
                    System.out.println(n1.getNombre(p) + " : Debajo del Peso ideal");
                case 0:
                    System.out.println(n1.getNombre(p) + " : Peso Ideal");
                case -1:
                    System.out.println(n1.getNombre(p) + " : Arriva del Peso ideal");
            }
        }
    }
}
