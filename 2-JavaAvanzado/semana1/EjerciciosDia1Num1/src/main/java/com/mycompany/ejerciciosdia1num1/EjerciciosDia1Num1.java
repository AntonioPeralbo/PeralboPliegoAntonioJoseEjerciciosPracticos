
package com.mycompany.ejerciciosdia1num1;

import com.mycompany.ejerciciosdia1num1.models.Vuelo;
import com.mycompany.ejerciciosdia1num1.models.excepcions.ReserveException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EjerciciosDia1Num1 {

    public static void main(String[] args) {
        
        Vuelo vuelo = new Vuelo();
        
        vuelo.reservar();
        
    }
}
