
package com.mycompany.ejerciciodia2num2.models;

public class ContrladorCalidad extends Trabajador implements Runnable{

    public ContrladorCalidad() {
    }

    public ContrladorCalidad(String name) {
        super(name);
    }

    @Override
    public void run() {
        
        tipo.controlCalidad();
    }
    
}
