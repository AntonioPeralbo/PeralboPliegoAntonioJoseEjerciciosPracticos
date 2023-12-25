//Ejercicio Nº 2 - Herencia y Polimorfismo - Individual
//
//Crear una clase llamada Vestimenta con los atributos: código, nombre, precio, marca, talla y color (con sus métodos y constructores correspondientes).
//
//a) Crear las siguientes clases hijas que compartan sus atributos y métodos:
//
//Zapato: material, tipoCierre
//
//Pantalon: estilo, tipoTejido
//
//Camiseta: manga, cuello
//
//Sombrero: tipo, tamaño
//
//b) Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta y almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero (crear un objeto con parámetros para cada uno de ellos).
//
//c) Crear los siguientes métodos (en cada subclase correspondiente):
//
//Zapato: método para mostrar un mensaje en pantalla que diga "Estos zapatos son de marca: " (mostrar marca).
//
//Pantalon: método para mostrar un mensaje en pantalla que diga "Estos pantalones son de marca: " (mostrar estilo).
//
//Camiseta: método para mostrar un mensaje en pantalla que diga "Esta camiseta es de marca: " (mostrar manga).
//
//Sombrero: método para mostrar un mensaje en pantalla que diga "Este sombrero es de marca: " (mostrar tipo).
//
//d) Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.
package ejerciciosdia5num2;

import ejerciciosdia5num2.Models.Hat;
import ejerciciosdia5num2.Models.Outfit;
import ejerciciosdia5num2.Models.Shirt;
import ejerciciosdia5num2.Models.Shoes;
import ejerciciosdia5num2.Models.Pants;

public class Main {

    public static void main(String[] args) {

        Outfit shoes1 = new Shoes("Sintetico", "cordon", 1, "Zapatilla deportiva", 60, "nike", "44", "blanco");
        Outfit shoes2 = new Shoes("Sintetico", "cordon", 2, "Zapatilla deportiva", 50, "adidas", "43", "negro");
        Outfit shoes3 = new Shoes("Sintetico", "velcro", 3, "Zapatilla deportiva", 65, "puma", "44", "Blanco y negro");
        Outfit pants1 = new Pants("Skinny", "pana", 4, "pantalon", 45, "zara", "42", "marron");
        Outfit pants2 = new Pants("Skinny", "algodon", 5, "pantalon", 30, "new balance", "43", "negro");
        Outfit pants3 = new Pants("Skinny", "vaquero", 6, "pantalon", 50, "jack and jones", "40", "azul");
        Outfit shirt1 = new Shirt("corta", "normal", 7, "camiseta", 30, "nike", "l", "blanco");
        Outfit shirt2 = new Shirt("larga", "mao", 8, "camiseta", 35, "adidas", "xl", "verde");
        Outfit hat1 = new Hat("gorra", "M", 9, "gorra deportiva", 20, "nike", "M", "blanco");
        
        Outfit[] outfit = new Outfit[9];
        outfit[0] = shoes1;
        outfit[1] = shoes2;
        outfit[2] = shoes3;
        outfit[3] = pants1;
        outfit[4] = pants2;
        outfit[5] = pants3;
        outfit[6] = shirt1;
        outfit[7] = shirt2;
        outfit[8] = hat1;
        
        
        for (int i = 0; i < outfit.length; i++) {
            outfit[i].mostrar();
            
        }
        
        
        
        
        
        
    }

}
