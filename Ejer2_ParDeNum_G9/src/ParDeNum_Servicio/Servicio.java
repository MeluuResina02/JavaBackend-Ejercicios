/*
 *Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar 
los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número.
Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular 
la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ParDeNum_Servicio;

import ParDeNumeros_Ent.ParDeNumeros;

public class Servicio {
    private ParDeNumeros par;

    public Servicio() {
        par = new ParDeNumeros();
    }
    
    public Servicio (double numero1, double numero2) {
        par = new ParDeNumeros(numero1, numero2);
    }
    
    public void mostrarValores(){
        System.out.println("Los valores son: " + par.getNumero1() + " y " + par.getNumero2());
    }
    
    public double devolverMayor(){
       return Math.max(par.getNumero1(), par.getNumero2());
    }
    
    public double calcularPotencia(){
        double mayor = devolverMayor();
        double menor = Math.min(par.getNumero1(), par.getNumero2());
        return Math.pow(Math.round(mayor), Math.round(menor));
    }
    
    public double devolverRaiz(){
        double menor = Math.min(par.getNumero1(), par.getNumero2());
        double valorAbsoluto = Math.abs(menor);
        return Math.sqrt(valorAbsoluto);
    }
}
