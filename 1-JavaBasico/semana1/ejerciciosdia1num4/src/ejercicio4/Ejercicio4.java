
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
       
      // ejercicio 4 a) Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes operaciones con ellos: suma, resta, multiplicación y división. Muestra por pantalla/consola los resultados de cada una de las operaciones con un mensaje amigable para el usuario.
        
        Scanner sc = new Scanner (System.in);
         int number1;
        
         int number2;
         
         
         System.out.println("Buenos dias, para comprobar el uso de nuestra calculadora necesitamos de su colaboracio./n");
         
         System.out.print ("Por favor, ingrese el primer numero" );
         
         number1 = sc.nextInt();
         
         System.out.println("Por favor, ingrese el segundo numero");
         
         number2 = sc.nextInt();
                  
         int suma = number1 + number2;
         int resta = number1 - number2;
         int multiplicacion = number1 * number2;
         double division = number1 / number2;
         
         System.out.println("Si sus dos eleciones se suman el resultado es : " + suma);
         System.out.println("Si sus dos eleciones se restan el resultado es : " + resta);
         System.out.println("Si sus dos eleciones se multiplican el resultado es : " + multiplicacion);
         System.out.println("Si sus dos eleciones se dividen el resultado es : " + division);
         
         System.out.println("Gracias por su colaboracion en la comprobacion de la calculadora");
        
          //ejercicio 4 b) Extra: ¿Qué sucede si como segundo número de una división se ingresa 0? Con lo que sabes o aprendiste hasta ahora… ¿De qué manera tratarías de evitar ésta situación?
          
          // si ingresamos 0 en el segundo numero la division dara infinito
          // 
                 
       
         
                 
            
    
    
    
    }
    
    
}
