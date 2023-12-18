package ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
        //Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana, calcule la temperatura máxima promedio que hubo.
        //Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima de cada día. Una vez almacenadas las temperaturas, deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.

        double suma = 0.0;
        double promedio ;
        double[] number = new double[7];

        number[0] = 27.2;
        number[1] = 29.4;
        number[2] = 32.6;
        number[3] = 30.8;
        number[4] = 29.2;
        number[5] = 26.7;
        number[6] = 28.6;

        System.out.println("temperaturas maximas");
        

        for (int i = 0; i < number.length; i++) {
            System.out.println("temperatura " + (i + 1) + " es :" + number[i]);
            suma = suma + number[i];
        }
            promedio = suma / number.length;
            System.out.println(" El promedio es " + promedio);
        
      
    }
}