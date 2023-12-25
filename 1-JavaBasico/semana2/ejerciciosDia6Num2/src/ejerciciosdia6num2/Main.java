//Ejercicio Nº 2 - Collections - Individual (Extra/Opcional)
//
//Un administrador de una tienda de electrónica necesita un programa para gestionar los productos en su inventario. Para ello, necesita la creación de una clase Producto que cuente con los siguientes datos: código, nombre, marca, tipo, precio costo, precio venta, cantidad en stock.
//
//A partir de esto, realizar las siguientes acciones en el programa desarrollado:
//
//a) Crear 10 objetos de tipo Producto con sus correspondientes valores cargados (por ejemplo, teléfono, laptop, auriculares/cascos, cargador, tablet, etc).
//
//b) Guardar estos objetos creados en un ArrayList.
//
//c) Recorrer el ArrayList y determinar el producto con el mayor precio de venta.
//
//d) Recorrer el ArrayList y determinar el producto con el menor precio de costo.
//
//e) Borrar el producto que se encuentre en la posición 5 del ArrayList.
//
//f) Determinar el producto que tenga la mayor cantidad en stock. A ese producto, descontarle 3 unidades del stock y actualizar el registro en la lista en base a eso.
//
//g) Mostrar siempre por consola un mensaje informativo luego de resolver cada punto.
//package ejerciciosdia6num2;
package ejerciciosdia6num2;

import ejerciciosdia6num2.Mocels.Producto;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        double numMax = 0;
        Producto producto1 = new Producto(1, "Movil", "Samsung", "Smartphone", 200, 499, 8);
        Producto producto2 = new Producto(2, "Ordenador ", "HP", "Laptop", 190, 350, 5);
        Producto producto3 = new Producto(3, "Cargador", "Samsung", "C", 5, 20, 9);
        Producto producto4 = new Producto(4, "Cargador", "HP", "Laptop", 15, 55, 12);
        Producto producto5 = new Producto(5, "Pilas", "Duracell", "AA", 0.50, 5, 4);
        Producto producto6 = new Producto(6, "Ordenador", "HP", "Torre", 160, 325, 6);
        Producto producto7 = new Producto(7, "Tablet", "Apple", "20 Pulgadas", 70, 200, 21);
        Producto producto8 = new Producto(8, "Play station 5", "Sony", "digital", 200, 700, 7);
        Producto producto9 = new Producto(9, "Xbox ", "Microsof", "Series X", 200, 680, 10);
        Producto producto10 = new Producto(10, "Auriculares", "Beat", "Inalambrico", 10, 50, 35);

        ArrayList<Producto> producto = new ArrayList<>();

        producto.add(producto1);
        producto.add(producto2);
        producto.add(producto3);
        producto.add(producto4);
        producto.add(producto5);
        producto.add(producto6);
        producto.add(producto7);
        producto.add(producto8);
        producto.add(producto9);
        producto.add(producto10);

        Producto precioMaximoVenta = producto1;
        Producto precioMinimoCoste = producto1;

        for (Producto elemento : producto) {
            if (elemento.getPrecioVenta() > precioMaximoVenta.getPrecioVenta()) {
                precioMaximoVenta = elemento;

            }
        }
        System.out.println(" EL precio maximo de venta es " + precioMaximoVenta.getPrecioVenta());
        for (Producto elemento : producto) {
            if (elemento.getPrecioCosto() < precioMinimoCoste.getPrecioCosto()) {
                precioMinimoCoste = elemento;

            }

        }
        System.out.println(" EL precio minimo de coste  es " + precioMinimoCoste.getPrecioCosto());
        
        
        
        producto.remove(producto6);
        
        System.out.println(producto);
            
            
         Producto mayorStock = producto1;
         for (Producto elemento : producto) {
            if (elemento.getStock()> mayorStock.getStock()) {
               mayorStock = elemento;
                
            }
        }
    mayorStock.setStock(mayorStock.getStock()- 3 );
        System.out.println("El producto con mayor stock es " + mayorStock);
    
    }
    
}
