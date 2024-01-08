
package com.mycompany.ejerciciosdia6num2.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class RegistroMascotas <T extends Mascotas>{
    
   private List<T> listaMascotas ;
   
   public RegistroMascotas( ) {
   this.listaMascotas = new ArrayList<>();
   }
  
    public void agregarMascota (T mascota){
    this.listaMascotas.add(mascota);
    
    }
    
   
     public int totalMascotas (){
         return listaMascotas.size();
     
        }       
    
     
     public void buscarMascota (String nombre){
     
     List<T> filtroNombre = listaMascotas.stream()
             .filter(mascota-> mascota.getNombre().equalsIgnoreCase(nombre))
             .collect(Collectors.toList());
             
             
     filtroNombre.forEach(System.out::println);
     }
     
}
