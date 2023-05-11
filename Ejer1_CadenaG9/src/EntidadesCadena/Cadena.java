/*
 * Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una 
frase (String) y su longitud. Agregar constructor vacío y con atributo frase solamente. 
Agregar getters y setters. El constructor con frase como atributo debe setear la longitud de 
la frase de manera automática. Crear una clase CadenaServicio en el paquete servicios que implemente
los siguientes métodos:
 */
package EntidadesCadena;

public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {
        this.frase = "";
        this.longitud = 0;
    }
    
    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }    
}
