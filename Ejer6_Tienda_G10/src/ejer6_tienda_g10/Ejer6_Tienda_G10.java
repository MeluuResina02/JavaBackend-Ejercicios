/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer6_tienda_g10;

import ServicioTienda.ServicioTienda;
import TiendaEntidades.Tienda;
import java.util.Scanner;

/**
 *
 * @author melani
 */
public class Ejer6_Tienda_G10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicioTienda tienda = new ServicioTienda();
        
        while (true){
            System.out.println("Menú: ");
            System.out.println("\n 1. Agregar producto");
            System.out.println("\n 2. Modificar precio");
            System.out.println("\n 3. Eliminar producto");
            System.out.println("\n 4. Mostrar productos");
            System.out.println("\n 5. Salir");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            if(opcion == 1){
                System.out.println("Ingrese el nombre del producto: ");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese el precio del producto: ");
                double precio = scanner.nextDouble();
                scanner.nextLine();
                
                Tienda producto = new Tienda(nombre, precio);
                tienda.agregarProducto(producto);
                System.out.println("Producto agregado.");
                
            }else if (opcion == 2){
                System.out.println("Ingrese el nombre del producto:" );
                String nombre = scanner.nextLine();
                System.out.println("Ingrese el nuevo precio del producto: ");
                double precio = scanner.nextDouble();
                scanner.nextLine();
                tienda.modificarPrecio(nombre, precio);
                System.out.println("Precio modificado.");
                
            }else if (opcion == 3){
                System.out.println("Ingrese el nombre del producto a eliminar: ");
                String nombre = scanner.nextLine();
                tienda.eliminarProducto(nombre);
                System.out.println("Producto eliminado.");
                
            }else if (opcion == 4){
                tienda.mostrarProductos();
                
            }else if (opcion == 5){
                System.out.println("Cerrando menú");
                break;
                
            }else{
                System.out.println("Opcion inválida.");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}
