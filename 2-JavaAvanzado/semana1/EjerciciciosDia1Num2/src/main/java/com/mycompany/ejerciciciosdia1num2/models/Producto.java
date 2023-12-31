package com.mycompany.ejerciciciosdia1num2.models;

import java.util.Scanner;

public class Producto {

    private String nombre;
    private double precio;
    private int cantidadDisponible;

    public Producto() {
    }

    public Producto(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public void gestionInventario() {
        Scanner sc = new Scanner(System.in);
        Producto producto = new Producto();
        System.out.println("Ingrese el nombre del producto");
        producto.setNombre(sc.nextLine());
        try {
            if (producto.getNombre().isEmpty()) {
                throw new InventarioException("El nombre no puede ir vacio");
            }

        } catch (InventarioException e) {
            e.printStackTrace();
        }
        System.out.println("Ingrese el precio");
        producto.setPrecio(sc.nextDouble());
        try {
            if (producto.getPrecio() <= 0) {
                throw new InventarioException("el precio no puede ser menor a o igual a 0");

            }

        } catch (InventarioException e) {
            e.printStackTrace();
        }
    
        System.out.println("Introduzca la cantidad que desea llevarse");
        producto.setCantidadDisponible(sc.nextInt());
        try {
            if (producto.getCantidadDisponible()<= 0) {
                throw new InventarioException("no puede llevarse una cantidad negativa de objetos"); 
            }
        } catch (InventarioException e) {
            e.printStackTrace();
        }
    }
    
}
