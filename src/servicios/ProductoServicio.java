/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Edgardo
 */
public class ProductoServicio {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
   public void introducirElemento (HashMap <String ,Double> productos){
       System.out.println("Ingresar el nombre del producto");
       String nombre=leer.next();
       System.out.println("Ingresar el precio del producto");
       Double precio=leer.nextDouble();
       productos.put(nombre,precio);
   }
   public void modificarPrecio (HashMap <String, Double> productos){
       System.out.println("Ingresar el nombre del producto que desea cambiar el precio");
       String nombre=leer.next();
       System.out.println("Inghresar el nuevo precio del producto");
       Double precio=leer.nextDouble();
       productos.replace(nombre, precio);
       
   }
   public void eliminarProducto (HashMap <String, Double> productos){
       System.out.println("Ingrese el nombre del producto a eliminar");
       String nombre=leer.next();
       productos.remove(nombre);
       
   }
   public void mostrarProductosConPrecio (HashMap <String, Double> productos){
       for(Map.Entry <String ,Double> producto:productos.entrySet()){
           System.out.println("Producto "+producto.getKey()+" precio: "+producto);
           
       }
   }
}
