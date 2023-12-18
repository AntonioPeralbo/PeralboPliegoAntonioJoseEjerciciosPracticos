package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        /*
        Imagina que estás trabajando en un sistema de reservas de asientos para un teatro. Crea un programa en Java que represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:

Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").

Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento (por ejemplo, "Fila 3, Asiento 2"). El programa debe marcar como ocupado ese asiento solo en caso de que esté vacío.

Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.

A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla luego de cada reserva.

Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores y tú el encargado del teatro. ¿Funciona para todos los casos? ¿Encontraste errores que resolver? ¿Considera tu programa los asientos ya reservados?

El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine que ha finalizado.
         */
        int fila;
        int columna;
        String o = " disponible ";
        String x = " ocupado ";
        boolean flag = false;
        boolean flagout = false;
        String[][] asientos = {{o, o, x, x, o}, {x, x, o, x, o}, {o, o, x, o, x}, {x, x, o, x, o}, {x, o, o, o, x}};

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (asientos[i][j] == o) {
                   flag = true;
                }
            }

        }
        while (flag && !flagout) {

            System.out.println("Por favor, ingrese el numero de fila y a continuacion el de la columna");
            fila = Integer.parseInt(sc.next());
            columna = Integer.parseInt(sc.next());
            System.out.println(" el asiento elgido  se encuenta " + asientos[fila - 1][columna - 1]);

            while (asientos[fila - 1][columna - 1] == x) {
                System.out.println("Por favor, ingrese el numero de fila y a continuacion el de la columna");
                fila = Integer.parseInt(sc.next());
                columna = Integer.parseInt(sc.next());
                System.out.println(" el asiento elgido se encuenta" + asientos[fila - 1][columna - 1]);

            }

            asientos[fila - 1][columna - 1] = x;
            System.out.println("Su asiento ha sido reservado");
            flagout = true;
            for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (asientos[i][j] == o) {
                   flagout = false;
                }
            }

        }
            
        }
        System.out.println("Todos los asientos estan ocupados");
    }
    
}
