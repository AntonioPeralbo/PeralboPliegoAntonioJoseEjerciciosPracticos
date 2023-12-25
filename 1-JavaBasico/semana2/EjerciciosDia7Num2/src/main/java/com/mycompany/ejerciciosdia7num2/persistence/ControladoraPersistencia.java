package com.mycompany.ejerciciosdia7num2.persistence;

import com.mycompany.ejerciciosdia7num2.models.Platillos;
import com.mycompany.ejerciciosdia7num2.persistence.PlatillosJpaController;
import com.mycompany.ejerciciosdia7num2.persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    PlatillosJpaController platillosJPA = new PlatillosJpaController();

    public void crearPlatillo(Platillos plato) {
        platillosJPA.create(plato);
    }

    public void eliminarPlatillo(int id) {
        try {
            platillosJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarPlatillo(Platillos plato) {
        try {
            platillosJPA.edit(plato);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Platillos traerPlatillo(int id) {
        return platillosJPA.findPlatillos(id);

    }

    public ArrayList<Platillos> traerListaPlatillos() {
        List<Platillos> lista = platillosJPA.findPlatillosEntities();
        ArrayList <Platillos> listaPlatos = new ArrayList<>(lista);
        return listaPlatos ;
    }

} 
