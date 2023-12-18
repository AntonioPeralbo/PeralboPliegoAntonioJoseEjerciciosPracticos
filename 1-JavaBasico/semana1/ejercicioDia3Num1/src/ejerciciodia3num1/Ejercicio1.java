package ejerciciodia3num1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Electrodomesticos electrodomestico = new Electrodomesticos();

        Electrodomesticos electrodomestico2 = new Electrodomesticos(1, "boch", "nevera", "a+", "blanco");

        Electrodomesticos electrodomestico3 = new Electrodomesticos(2, "LG", "lavadora", "b+", "negro");

        Electrodomesticos electrodomestico4 = new Electrodomesticos(3, "balay", "microondas", "a+", "blanco");

        System.out.println("A continuacion le mostramos el articulo selecionado:  modelo " + electrodomestico2.getModelo() + ", la marca " + electrodomestico2.getMarca() + " y el consumo " + electrodomestico2.getConsumo() + " del electrodomestico");
        System.out.println("Te mostramos el "+ electrodomestico.getMarca());
        // al estar sin inicializar atributo, al pedirolo y no haber parametro en el constructor del objeto, nos lo de vuele como null.
    }
}
