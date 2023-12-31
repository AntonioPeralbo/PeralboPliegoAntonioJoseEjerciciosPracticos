package com.mycompany.ejerciciciosdia1num3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjerciciciosDia1Num3 {

    public static void main(String[] args) {

        try {
            String[] posiciones = {"1", "2", "3", "4", "5"};
            Scanner sc = new Scanner(System.in);
            
            
            System.out.println("Introduce la posicion que desea ver: ");
            
            System.out.println( posiciones[sc.nextInt()] );
            
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No existe la poscion en el vector" );
        } catch (InputMismatchException e) {
            System.out.println("No se pueden introducir letras para elegir la posicion del vector");

        }
    }
}
