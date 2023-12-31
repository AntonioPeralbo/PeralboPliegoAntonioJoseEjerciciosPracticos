
package com.mycompany.ejerciciodia2num2.models;


public class Ensamblador extends Trabajador implements Runnable {

    public Ensamblador() {
    }

    public Ensamblador(String name) {
        super(name);
    }
    
    
    @Override
    public void run() {
        tipo.ensamblar();
        
        

    }
    
}
