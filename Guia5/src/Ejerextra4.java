
import java.util.Scanner;

/*
 * Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos 
y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad de
aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio 
mayor o igual al 7 de sus notas del curso.

 */

/**
 *
 * @author max_m
 */
public class Ejerextra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[][] not = new int[10][4];
        int cont, n, tp1, tp2, tp3, tp4;
        double nota1 = 0, nota2 = 0,nota3 = 0, nota4 = 0, promedio, contadorA= 0, contadorD= 0;
        
         Scanner leer= new Scanner (System.in);
       
       
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 4; j++) {
                not[i][j] = (int) (Math.random()*10)+1;              
                
            }
        }
        
        for (int i = 0; i < 10; i++) {
              for (int j = 0; j < 4; j++) {
                System.out.println("Nota "+ not[i][j] + " ");
            }
              System.out.println(" ");
        }
        
        
         for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 4; j++) {
               
                if (j == 0){
                tp1 = not[i][j]       ;
                nota1 = tp1 * 0.1;
                }
                if (j == 1){
                tp2 = not[i][j];
                nota2 = tp2 * 0.15;
                }
                if (j == 2){
                tp3 = not[i][j];
                nota3 = tp3 * 0.25;
                }
                if (j == 3){
                tp4 = not[i][j];
                nota4 = tp4 * 0.50;
                
                }               
               
            }
            
            promedio = (nota1 + nota2 + nota3 + nota4) / 4;
            if (promedio > 7)  {
                contadorA++;
            }else {
            contadorD++;
            }         
            
            
        }
        
        
        System.out.println("La cantidad de alumnos desaprobados es: " +  contadorD);
        System.out.println("La cantidad de alumnos aprobados" + contadorA );
        
    }
    
    
    
}
    
   
