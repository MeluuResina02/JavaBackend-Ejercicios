/*
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package ServicioTienda;

import TiendaEntidades.Tienda;
import java.util.HashMap;

/**
 *
 * @author melani
 */
public class ServicioTienda {
    private HashMap<String, Double> productos;
    
    public ServicioTienda(){
        this.productos = new HashMap<>();
    }
    
    public void agregarProducto(Tienda producto){
        productos.put(producto.getNombre(), producto.getPrecio());
        
    }
    
    public void modificarPrecio(String nombre, double precio){
        productos.replace(nombre, precio);
    }
    
    public void eliminarProducto(String nombre){
        productos.remove(nombre);
    }
    
    public void mostrarProductos(){
        for(String nombre : productos.keySet()){
            System.out.println(nombre + " : " + productos.get(nombre));
        }
    }
}
