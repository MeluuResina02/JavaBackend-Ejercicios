package Rectangulo;


import java.util.Scanner;

//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y
//un atributo privado altura. La clase incluirá un método para crear el rectángulo con los 
//datos del Rectángulo dados por el usuario. También incluirá un método para calcular la superficie
//del rectángulo y un método para calcular el perímetro del rectángulo. Por último, 
//tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
//Se deberán además definir los métodos getters, setters y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.

public class Rectangulo {
    private double base;
   private double altura;
   private double perimetro;
   private double superficie;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura, double perimetro, double superficie) {
        this.base = base;
        this.altura = altura;
        this.perimetro = perimetro;
        this.superficie = superficie;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    
    public void datoRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura del rectángulo y la base");
        altura = leer.nextDouble();
        base = leer.nextDouble();
    }
    public void superficie(){
        this.superficie = base * altura;
        System.out.println("La superficie del rectángulo es: " + superficie);
    }
    public void perimetro(){
        this.perimetro = (altura + base)*2;
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        
    }
    
    public void dibujar(){
        for (int i = 1; i <= altura ; i++) {
            System.out.println("");
            for (int j = 1; j <= base ; j++) {
                if (i == 1 || i == altura || j == 1 || j == base) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
        }System.out.println("");
    }
    }
            


