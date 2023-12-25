package ejercicio1.Models;

public class Auto extends Vehiculo implements Electrico {

    int capacidadBateria;
    String hs;

    public Auto() {
    }

    public Auto(int id, String placa, String marca, String modelo, int year, double costo, int capacidadBateria, String hs) {
        super(id, placa, marca, modelo, year, costo);
        this.capacidadBateria = capacidadBateria;
        this.hs = hs;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public String getHs() {
        return hs;
    }

    public void setHs(String hs) {
        this.hs = hs;
    }

    @Override
    public String toString() {
        return "Auto"  + super.toString() + "capacidadBateria=" + capacidadBateria + ", hs=" + hs + '}';
    }

    @Override
    public int antigudadVehiculo() {
      return actualYear- year ;
    }

    @Override
    public String cargarEnergia() {
return "electrico";
    }

}
