/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_guia10.pkg6;

import java.util.HashMap;
import java.util.Scanner;
import servicios.ProductoServicio;

/**
 *
 * @author Edgardo
 */
public class Menu_GUIA106 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap <String , Double> productos = new HashMap();
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        ProductoServicio ps=new ProductoServicio();
        boolean bucle =true;
        do{
            System.out.println("1.cargar productos");
            System.out.println("2.Modificar precio");
            System.out.println("3.Eliminar producto");
            System.out.println("4.Mostrar productos con precios");
            System.out.println("5.salir");
            int opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    ps.introducirElemento(productos);
                    break;
                case 2:
                    ps.modificarPrecio(productos);
                    break;
                case 3:
                    ps.eliminarProducto(productos);
                    break;
                case 4:
                    ps.mostrarProductosConPrecio(productos);
                    break;
                case 5:
                    bucle=false;
                    break;
                default: 
                    System.out.println("Opcion fuera del parametro");
                    break;
        }
        } while(bucle);
    }
    
}
