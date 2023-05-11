/*
 * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, 
un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas 
que puede realizar el usuario.
 */
package EntidadesAhorcado;

public class Ahorcado {
    private char[] palabra; 
    private int letrasEncontradas;
    private int oportunidadesRestantes;

    public Ahorcado() {
    }
    
    public Ahorcado(String palabra, int oportunidades) {
        this.palabra = palabra.toCharArray();
        this.letrasEncontradas = 0;
        this.oportunidadesRestantes = oportunidades;
    }
    
    public int getLongitud(){
        return palabra.length;
    }
    
    public boolean buscar(char letra){
        boolean encontrado = false;
        for(int i = 0; i < palabra.length; i++){
            if (palabra[i] == letra){
                letrasEncontradas++;
                encontrado =  true;
            }
        }
        if(!encontrado){
            oportunidadesRestantes--;
        }
        return encontrado;
    }
    
    public int[] letrasEncontradas(char letra){
        int[] encontradasFaltantes = new int[2];
        encontradasFaltantes[0] = letrasEncontradas;
        encontradasFaltantes[1] = palabra.length - letrasEncontradas;
        return encontradasFaltantes;
    }
    
    public int getOportunidadesRestantes(){
        return oportunidadesRestantes;
    }
    
    public boolean juegoTerminado(){
        return oportunidadesRestantes == 0 || letrasEncontradas == palabra.length;
    }
}
