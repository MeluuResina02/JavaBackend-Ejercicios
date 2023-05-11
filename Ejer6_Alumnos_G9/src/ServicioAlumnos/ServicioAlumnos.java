/*
 * 
 */
package ServicioAlumnos;

import Entidades.Alumnos;
import java.util.ArrayList;


public class ServicioAlumnos {
    private ArrayList<Alumnos> cursos;
    
    public ServicioAlumnos(){
        cursos = new ArrayList<>();
    }
    
    public void agregarCurso(Alumnos curso){
        cursos.add(curso);
    }
    
    public ArrayList<Alumnos> getCursos(){
        return cursos;
    }
    
    public void setCursos(ArrayList<Alumnos> cursos){
        this.cursos = cursos;
    }
}
