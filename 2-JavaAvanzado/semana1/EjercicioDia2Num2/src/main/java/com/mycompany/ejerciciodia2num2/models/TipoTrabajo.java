package com.mycompany.ejerciciodia2num2.models;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TipoTrabajo {

    public synchronized void ensamblar() {
        try {
            for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("El trabajador empieza a ensamblar"+i);
            Thread.sleep(1000);
            System.out.println("El trabajador ha terminado de ensamblar"+i);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(TipoTrabajo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public synchronized void controlCalidad() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
            System.out.println("El trabajador comienza el control de calidad" +i);
            Thread.sleep(1000);
            System.out.println("El trabajador ha realizado el control de calidad"+i);
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(TipoTrabajo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public synchronized void embalar() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
            System.out.println("El trabajador empieza a embalar"+i);
            Thread.sleep(1000);
            System.out.println("El trabajador termina de embalar"+i);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(TipoTrabajo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
