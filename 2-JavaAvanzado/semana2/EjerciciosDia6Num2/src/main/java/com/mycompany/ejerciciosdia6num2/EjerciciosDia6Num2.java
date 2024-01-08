

package com.mycompany.ejerciciosdia6num2;

import com.mycompany.ejerciciosdia6num2.models.Mascotas;
import com.mycompany.ejerciciosdia6num2.models.RegistroMascotas;


public class EjerciciosDia6Num2 {

    public static void main(String[] args) {
       
        RegistroMascotas inventario = new RegistroMascotas();
        
        
        inventario.agregarMascota(new Mascotas(1, "Pepe", 1, "Perro"));
        inventario.agregarMascota(new Mascotas(2, "Manchitas", 6, "Gato"));
        inventario.agregarMascota(new Mascotas(3, "Andy", 4, "Reptil"));
        inventario.agregarMascota(new Mascotas(4, "Rex", 3, "Ave"));
        
        inventario.totalMascotas();
        
        inventario.buscarMascota("Pepe");
    }
}
