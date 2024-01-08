
package com.mycompany.ejerciciosdia6num1.models;

import java.time.LocalDate;


public class Autos {
    
    private String marca;
    private String modelo;
    String fecha;
    double precio;

    public Autos() {
    }

    public Autos(String marca, String modelo, String fecha, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.fecha = fecha;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Autos{" + "marca=" + marca + ", modelo=" + modelo + ", fecha=" + fecha + ", precio=" + precio + '}';
    }
    
}
