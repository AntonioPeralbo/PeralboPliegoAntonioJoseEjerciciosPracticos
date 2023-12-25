//Ejercicio Nº 1 - Collections, Clases Abstractas e Interfaces - Grupal
//
//Un sistema de gestión de vehículos necesita ser desarrollado para una futura implementación para una tienda de venta de autos. Se requiere utilizar para su implementación tanto clases abstractas como interfaces para modelar este sistema.
//
//a) Clase Abstracta Vehiculo: Crear una clase abstracta llamada Vehiculo con los siguientes atributos: id, placa, marca, modelo, año, costo. Establecer un método abstracto para calcular la antigüedad del vehiculo.
//
//b) Interfaces: Crea dos interfaces llamadas Electrico y Combustion con métodos abstractos cargarEnergia() y recargarCombustible() respectivamente. En ambos casos, cuando se implementen en sus respectivas clases, deben mostrar un mensaje de qué tipo de recarga están haciendo.
//
//c) Clase Auto: Crea una clase Auto que herede de Vehiculo e implemente la interfaz Electrico. Agrega atributos específicos para los autos eléctricos, como capacidadBateria (en mah) y autonomia (en hs). Implementa los métodos abstractos de la clase abstracta Vehiculo y los de la interfaz Electrico.
//
//d) Clase Camioneta: Crea una clase Camioneta que herede de Vehiculo e implemente la interfaz Combustion. Agrega atributos específicos para las camionetas de combustión, como capacidadTanque y consumoCombustible. Implementa los métodos abstractos de la clase abstracta y los de la interfaz.
//
//e) Clase Moto: Crea una clase Moto que herede de Vehiculo e implemente la interfaz Combustion. Agrega atributos específicos para las motos de combustión, como cilindrada y tipoMotor. Implementa los métodos abstractos de la clase abstracta y los de la interfaz.
//
//f) Main: En el programa principal, crea objetos de diferentes tipos de vehículos (autos eléctricos, camionetas de combustión, motos de combustión) y añádelos a un ArrayList de tipo Vehiculo. Muestra información sobre cada uno de ellos, incluyendo el calculo de la antigüedad y la recarga de energía o combustible según corresponda.
//
//g) Polimorfismo: Recorrer el ArrayList de Vehículos y mostrar la información de cada uno de ellos.
package ejercicio1;

import ejercicio1.Models.Auto;
import ejercicio1.Models.Camioneta;
import ejercicio1.Models.Electrico;
import ejercicio1.Models.Moto;
import ejercicio1.Models.Vehiculo;
import java.util.ArrayList;
import ejercicio1.Models.Combustion;

public class Main {

    public static void main(String[] args) {

        Auto auto = new Auto(1, "22344mn", "Fiat", "Punto", 2012, 12000, 5000, "25 horas");
        Camioneta camioneta = new Camioneta(50, "12L a los 100km", 2, "3323jk", "Mazda ", "CX-30 ", 2010, 10000);
        Moto moto = new Moto("125cc", " V4", 3, "2345lo", "Ducati", "Diavel 1260", 2020, 8500);

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(auto);
        vehiculos.add(camioneta);
        vehiculos.add(moto);

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Auto) {
                Auto auto1 = (Auto) vehiculo;
                System.out.println(vehiculo +" tipo recarga "+ auto1.cargarEnergia()  +" antiguedad " +auto1.antigudadVehiculo());
            }

            if (vehiculo instanceof Camioneta) {
                Camioneta camioneta1 = (Camioneta) vehiculo;
                System.out.println(vehiculo + " tipo recarga "+camioneta1.recargarCombustible() + " antiguedad " + camioneta1.antigudadVehiculo());
            }
            if (vehiculo instanceof Moto) {
                Moto moto1 = (Moto) vehiculo;
                System.out.println(vehiculo +" tipo recarga "+ moto1.recargarCombustible() +" antiguedad " + moto1.antigudadVehiculo());
            }
        }
    }
}

