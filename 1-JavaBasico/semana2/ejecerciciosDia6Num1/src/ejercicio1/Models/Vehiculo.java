
package ejercicio1.Models;

import java.util.Calendar;


public abstract class Vehiculo {
    Calendar cal = Calendar.getInstance();
    int actualYear= cal.get(Calendar.YEAR);
    int id;
    String placa;
    String marca;
    String modelo;
    int year;
    double costo;

    public Vehiculo() {
    }

    public Vehiculo(int id, String placa, String marca, String modelo, int year, double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "" + "id=" + id + ", placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", year=" + year + ", costo=" + costo + '}';
    }
    
    public abstract int antigudadVehiculo();
 
  
    
    
    
    
    
    
    
}
