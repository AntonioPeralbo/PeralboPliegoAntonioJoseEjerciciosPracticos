package com.mycompany.ejerciciodia2num2.models;

public class Trabajador {

    private String name;

TipoTrabajo tipo = new TipoTrabajo();

    public Trabajador() {
    }

    public Trabajador(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "name=" + name + '}';
    }

   
  

}
