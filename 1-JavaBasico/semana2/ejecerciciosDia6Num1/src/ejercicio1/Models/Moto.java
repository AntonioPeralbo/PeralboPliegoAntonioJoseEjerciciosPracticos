package ejercicio1.Models;

public class Moto extends Vehiculo implements Combustion {

    String cilindrada;
    String tipoMotor;

    public Moto() {
    }

    public Moto(String cilindrada, String tipoMotor, int id, String placa, String marca, String modelo, int year, double costo) {
        super(id, placa, marca, modelo, year, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String toString() {
        return "Moto"+ super.toString() + "cilindrada=" + cilindrada + ", tipoMotor=" + tipoMotor + '}';
    }

    @Override
    public int antigudadVehiculo() {
      return actualYear- year;
    }

    @Override
    public String recargarCombustible() {
return "diesel";
    }

}
