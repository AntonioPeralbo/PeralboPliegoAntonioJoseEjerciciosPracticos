package com.mycompany.ejerciciosdia7num2.models;

import com.mycompany.ejerciciosdia7num2.persistence.ControladoraPersistencia;
import java.util.ArrayList;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearPlatillo(Platillos plato) {

        controlPersis.crearPlatillo(plato);
    }

    public void eliminarPlatillo(int id) {
        controlPersis.eliminarPlatillo(id);

    }

    public void editarPlatillo(Platillos plato) {
     controlPersis.editarPlatillo(plato);
    }

    public Platillos traerPlatillo (int id){
    
        return controlPersis.traerPlatillo(id);
        
        }
    public ArrayList<Platillos> traerListaPlatillos() {
        return controlPersis.traerListaPlatillos();
     }
}
