package com.mycompany.ejerciciosdia7num2;

import com.mycompany.ejerciciosdia7num2.models.Controladora;
import com.mycompany.ejerciciosdia7num2.models.Platillos;
import java.util.ArrayList;

public class EjerciciosDia7Num2 {

    public static void main(String[] args) {

        Controladora control = new Controladora();

        Platillos plato = new Platillos("Macarrones con tomate", "cocer pasta 10 minutos, echar el tomate", 5);

//        control.crearPlatillo(plato);
        Platillos plato2 = new Platillos("Filete de pollo con patatas", "Freir el filete de pollo, freir las patatas y presentar", 10);
        Platillos plato3 = new Platillos("Lagrimas de pllo", "rebozar tiras de pollo, freir las tiras y acompañar con arroz", 15);
//        
//        control.crearPlatillo(plato2);
//        control.crearPlatillo(plato3);

//       control.eliminarPlatillo(10);
//      plato2.setReceta("MArinar el pollo 8 horas, freir y servir sobre una cama de patatas y cebolla");
//      control.editarPlatillo(plato2);
        Platillos platoControl = control.traerPlatillo(1);
        System.out.println("El plato es " + platoControl.toString());
        
        ArrayList <Platillos> listaCompleta = control.traerListaPlatillos();
        
        
        for (Platillos listaP : listaCompleta) {
            System.out.println("\n el plato es :" + listaP.toString());
        }
     
        
    }
}
