
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

   
    public static void main(String[] args) {
        
        //Ejercicio Nº 1 - Estructuras Condicionales - Individual

//a) Una recital permite únicamente el ingreso de mayores de 18 años. Para ello necesita un programa que, a partir de que un usuario ingrese su edad, determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento. El programa debe mostrar (según cada caso) un mensaje informando la situación.
        
        
        
        
        
         Scanner sc = new Scanner (System.in);
         
            int edad;
            
           System.out.println("Buenos dias, por favor ingrese su edad");
                   edad = sc.nextInt();
            
            if (edad >= 18) {
                System.out.println("Bienvenido al recital");
        } else { 
                System.out.println("Lamentablemente no puede acceder si no es mayor de edad");
        }
          
        
    }
    
}
