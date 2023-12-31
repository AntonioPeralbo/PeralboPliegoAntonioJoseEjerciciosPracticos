
package com.mycompany.ejerciciodia2num2.models;


public class Embalador extends Trabajador implements Runnable{

    public Embalador() {
    }

    public Embalador(String name) {
        super(name);
    }
    
    

    @Override
    public void run() {
        tipo.embalar();
    }
}
