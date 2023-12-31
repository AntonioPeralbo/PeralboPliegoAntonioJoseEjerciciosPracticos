

package com.mycompany.ejerciciodia2num1;

import com.mycompany.ejerciciodia2num1.models.AgenteTelefonico;
import com.mycompany.ejerciciodia2num1.models.Llamadas;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EjercicioDia2Num1 {

    public static void main(String[] args) {
        
        try {
            Llamadas llamada = new Llamadas();
            
         Thread agente1 =new Thread(new AgenteTelefonico("Sergio"),"Sergio");
            
            Thread agente2 = new Thread(new AgenteTelefonico("Sara"), "Sara");
            Thread agente3 = new Thread(new AgenteTelefonico("Raul"), "Raul");
            
            
            agente1.start();
            agente2.start();
            agente3.start();
            
            agente1.join();
            agente2.join();
            agente3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(EjercicioDia2Num1.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
