/*
 * Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo:
Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar 
cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase
con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase
ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase,
por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario
y devuelve verdadero si la contiene y falso si no.
 */
package CadenaServicio;

import EntidadesCadena.Cadena;

public class CadenaServicio {
    private Cadena cadena;
    
    public CadenaServicio(Cadena cadena){
        this.cadena = cadena;
    }
    
    public int mostarVocales(){
        int contador = 0;
        char[] vocales =  {'a', 'e', 'i', 'o', 'u'};
        
         for (int i = 0; i < cadena.getLongitud(); i++) {
            for (int j = 0; j < vocales.length; j++) {
                if (cadena.getFrase().charAt(i) == vocales[j]) {
                    contador++;
                }
            }
        }
        
        return contador;
    }
    
    public void invertirFrase(){
        char[] fraseArray = cadena.getFrase().toCharArray();
        char[] invertida = new char[cadena.getLongitud()];
        
        for(int i = 0; i < cadena.getLongitud(); i++){
            invertida[i] = fraseArray[cadena.getLongitud() - i -1];
        } 
        System.out.println(String.valueOf(invertida));
    }
    
    public int vecesRepetido(char letra){
       int contador = 0;
        
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().charAt(i) == letra) {
                contador++;
            }
        }
        
        return contador;
    }
    
    public int compararLongitud(String frase){
        return cadena.getLongitud() - frase.length();
    }
    
    public void unirFrases(String frase){
        System.out.println(cadena.getFrase()+ " " + frase);
    }
    
    public void reemplazar(char letra, char reemplazo){
        char[] fraseArray = cadena.getFrase().toCharArray();
        
        for(int i = 0; i < cadena.getLongitud(); i++){
         if(fraseArray[i] == letra){
             fraseArray[i] = reemplazo;
         }   
        }
        System.out.println(String.copyValueOf(fraseArray));
    }
    
    public boolean contiene(char letra){
        for(int i = 0; i < cadena.getLongitud(); i++){
            if(cadena.getFrase().charAt(i) == letra){
                return true;
            }
        }
        return false;
    }
}