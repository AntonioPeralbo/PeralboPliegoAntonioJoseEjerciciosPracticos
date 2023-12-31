package com.mycompany.ejerciciosdia1num1.models;

import com.mycompany.ejerciciosdia1num1.models.excepcions.ReserveException;
import com.mycompany.ejerciciosdia1num1.services.ReservaInvalida;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Vuelo {

    String nombre;
    String destino;
    Date fechaViaje;
    Integer asientosDeseados;

    public Vuelo() {
    }

    public Vuelo(String nombre, String destino, Date fechaViaje, Integer asientosDeseados) {
        this.nombre = nombre;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.asientosDeseados = asientosDeseados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(Date fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public Integer getAsientosDeseados() {
        return asientosDeseados;
    }

    public void setAsientosDeseados(Integer asientosDeseados) {
        this.asientosDeseados = asientosDeseados;
    }

    @Override
    public String toString() {
        return "ReservasVuelo{" + "nombre=" + nombre + ", destino=" + destino + ", fechaViaje=" + fechaViaje + ", asientosDeseados=" + asientosDeseados + '}';
    }

   
        

    
    public void reservar() throws ParseException{
        Vuelo vuelo = new Vuelo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Intoduzca su nombre");
        vuelo.setNombre(sc.nextLine());
        
        try {
            if (vuelo.getNombre().isEmpty())
               throw new ReservaInvalida("Error en el nombre");
        } catch (ReservaInvalida e) {
            
        }
    
        System.out.println("Introdizca destino");
        vuelo.setDestino(sc.nextLine());
        try {
            if( vuelo.getDestino().isEmpty())
            throw new ReservaInvalida("Error al introducir el nombre");
        } catch (ReservaInvalida e) {
        }
        System.out.println(" Introduzca fecha deseada");
        String fecha = sc.next();
        fechaViaje = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
        vuelo.setFechaViaje(fechaViaje);
       
        try {
            if (vuelo.getFechaViaje().before(fechaViaje)) {
                throw new ReservaInvalida(" Error al introducir la fecha");
            }
            
        } 
                
        catch (ReservaInvalida e) {
        }
        System.out.println("Ingrese el numero de asiento que desea");
        vuelo.setAsientosDeseados(sc.nextInt());
        try {
            if (vuelo.getAsientosDeseados()<=10) {
                throw new ReservaInvalida("no puede reservar mas de 10 asientos");
            }
        } catch (ReservaInvalida e) {
        }
    
    }
    
    

}
