package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        //a) Imagina que eres un cajero en un supermercado. Crea un programa en Java que permita ingresar el precio de varios productos comprados por un cliente.
        //Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario decida finalizar. Luego, muestra el total de la compra que debe abonar.
        Scanner sc = new Scanner(System.in);
        double number;
        boolean flag = false;
        double acc = 0;

        System.out.println("Por favor ingrese el precio de cada produccto. Para finalizar y que se pueda proceder al pago recuerde que debe usar el 0");

        while (flag == false) {
            System.out.println("Ingrese el precio y pulse enter");

            number = sc.nextDouble();

            if (number <= 0) {
                flag = true;

            }
            acc += number;
            
        }
        System.out.println("El total de su compra es: " + acc);
    }

}
