/*
 * Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente letra (NIF).
Los atributos serán el número de DNI (entero largo) y la letra (String o char) que le corresponde. 
En NIFService se dispondrá de los siguientes métodos:
Métodos getters y setters para el número de DNI y la letra.
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. 
Una vez calculado, le asigna la letra que le corresponde según
Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; 
por ejemplo: 00395469-F).
 */
package Entidades_NIF;

public class NIF_Ent {
    private long numDNI;
    private char letra;

    public NIF_Ent() {
    }

    public NIF_Ent(long numDNI, char letra) {
        this.numDNI = numDNI;
        this.letra = letra;
    }

    public long getNumDNI() {
        return numDNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setNumDNI(long numDNI) {
        this.numDNI = numDNI;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
}
