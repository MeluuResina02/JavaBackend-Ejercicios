/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer2_G7;

import java.util.Scanner;

/**
 *
 * @author max_m
 */
public class Circun {

    private double radio;
    
    public Circun(){
        //
    }
   
    public Circun(double radio) {
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
        
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircun(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese radio de la circunferencia");
        
        radio = scanner.nextDouble(); 
    }
    
    public double area(){
        double area = Math.PI * radio * radio;
        
        System.out.println("Area : " + area );
        
        return area;
    }
    
    public double perimetro(){
        double perimetro = 2 * Math.PI * radio;
        
        System.out.println("Perimetro : " + perimetro );
        
        return perimetro;
    } 
    
}
