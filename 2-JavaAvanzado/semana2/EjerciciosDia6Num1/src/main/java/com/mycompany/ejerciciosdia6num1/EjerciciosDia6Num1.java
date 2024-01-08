
package com.mycompany.ejerciciosdia6num1;

import com.mycompany.ejerciciosdia6num1.models.Autos;
import com.mycompany.ejerciciosdia6num1.models.InventarioAutos;
import java.time.LocalDate;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;


public class EjerciciosDia6Num1 {

//    Ejercicio 1: Concesionaria de Autos
//
//Una concesionaria de vehículos necesita un sistema para administrar su inventario de autos. Crea una clase Auto con atributos como marca, modelo, año, y precio. Implementa una clase utilitaria InventarioAutos con métodos genéricos para realizar las siguientes operaciones:
//
//Agregar Autos al Inventario: Utiliza un método genérico para agregar autos al inventario de la concesionaria.
//
//Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan buscar autos por marca o año dentro del inventario.
//
//Calcular el Valor Total del Inventario: Desarrolla un método genérico que calcule el valor total de todos los autos en el inventario. 
    
    public static void main(String[] args) {
        
        InventarioAutos inventario = new InventarioAutos();
        
        inventario.agregarAuto(new Autos("seat", "Ibiza", "2005", 12000.00));
        inventario.agregarAuto(new Autos("seat", "Leon", "2012", 15000.00));
        inventario.agregarAuto(new Autos("fiat", "punto", "2002", 11000.00));
        inventario.agregarAuto(new Autos("ford", "focus", "2015", 14000.00));
        inventario.agregarAuto(new Autos("citroen", "xsara", "2016", 14300.00));
        inventario.agregarAuto(new Autos("renault", "clio", "2005", 14560.00));
        
        
         inventario.buscarAuto("seat");
         
         inventario.totalInventario();
                
    }
}
