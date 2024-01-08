package com.mycompany.ejerciciosdia6num2.models;

public class Mascotas<T> {

    private int Id;
    private String nombre;
    private int edad;
    private String especie;

    public Mascotas() {
    }

    public Mascotas(int Id, String nombre, int edad, String especie) {
        this.Id = Id;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Mascotas{" + "Id=" + Id + ", nombre=" + nombre + ", edad=" + edad + ", especie=" + especie + '}';
    }

}
