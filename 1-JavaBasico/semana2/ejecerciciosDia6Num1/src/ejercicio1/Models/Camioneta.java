package ejercicio1.Models;

public class Camioneta extends Vehiculo implements Combustion {

    int capacidadTanque;
    String consumoCombustible;

    public Camioneta() {
    }

    public Camioneta(int capacidadTanque, String consumoCombustible, int id, String placa, String marca, String modelo, int year, double costo) {
        super(id, placa, marca, modelo, year, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public String getConsumoCombustible() {
        return consumoCombustible;
    }

    @Override
    public String toString() {
        return "Camioneta " + super.toString() + "capacidadTanque=" + capacidadTanque + ", consumoCombustible=" + consumoCombustible + '}';
    }

    public void setConsumoCombustible(String consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

   @Override
    public int antigudadVehiculo() {
      return actualYear- year;
    }

    @Override
    public String recargarCombustible() {
    return "gasolina";
    }

}
