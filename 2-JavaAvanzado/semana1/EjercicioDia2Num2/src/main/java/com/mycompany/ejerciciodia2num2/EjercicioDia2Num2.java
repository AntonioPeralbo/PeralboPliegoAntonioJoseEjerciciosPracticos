
package com.mycompany.ejerciciodia2num2;

import com.mycompany.ejerciciodia2num2.models.ContrladorCalidad;
import com.mycompany.ejerciciodia2num2.models.Embalador;
import com.mycompany.ejerciciodia2num2.models.Ensamblador;
import com.mycompany.ejerciciodia2num2.models.TipoTrabajo;
import com.mycompany.ejerciciodia2num2.models.Trabajador;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EjercicioDia2Num2 {

    public static void main(String[] args) {
        try {
            TipoTrabajo tipo = new TipoTrabajo();
            
            
            Thread trabajador1 = new Thread(new Ensamblador("Pedro"), "Pedro");
            Thread trabajador2 = new Thread(new ContrladorCalidad("Alvaro"), "Alvaro");
            Thread trabajador3 = new Thread(new Embalador("Angela"), "Angela");
            
            trabajador1.start();
           Thread.sleep(1000);
            trabajador2.start();
            Thread.sleep(1000);
            trabajador3.start();
            Thread.sleep(1000);
            trabajador1.join();
            trabajador2.join();
            trabajador3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(EjercicioDia2Num2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
