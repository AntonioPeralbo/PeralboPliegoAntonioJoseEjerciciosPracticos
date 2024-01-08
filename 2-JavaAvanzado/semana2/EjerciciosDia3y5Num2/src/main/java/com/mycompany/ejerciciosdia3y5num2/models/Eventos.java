
package com.mycompany.ejerciciosdia3y5num2.models;

import java.time.LocalDate;


public class Eventos {
    
    private String nombre;
    private String fecha;
    private String categoria;

    public Eventos() {
    }

    public Eventos(String nombre, String fecha, String categoria) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Eventos{" + "nombre=" + nombre + ", fecha=" + fecha + ", categoria=" + categoria + '}';
    }
    
    
}
