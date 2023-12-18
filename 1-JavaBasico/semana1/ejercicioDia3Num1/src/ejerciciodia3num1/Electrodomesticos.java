
package ejerciciodia3num1;


public class Electrodomesticos {
    
    int cod;
    String marca ;
    String modelo;
    String consumo;
    String color;

    public Electrodomesticos() {
        
    }
    
    
    
    public Electrodomesticos(int cod, String marca, String modelo, String consumo, String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" + "cod=" + cod + ", marca=" + marca + ", modelo=" + modelo + ", consumo=" + consumo + ", color=" + color + '}';
    }
    
    
    
}
