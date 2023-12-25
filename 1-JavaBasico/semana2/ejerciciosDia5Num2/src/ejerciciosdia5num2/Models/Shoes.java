
package ejerciciosdia5num2.Models;

import java.util.logging.Logger;


public class Shoes extends Outfit {
    
    String material;
    String closing;

    public Shoes() {
    }

    public Shoes(String material, String closing, int code, String name, double price, String brand, String size, String color ) {
        super(code, name, price, brand, size, color);
        this.material = material;
        this.closing = closing;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getClosing() {
        return closing;
    }

    public void setClosing(String closing) {
        this.closing = closing;
    }

    @Override
    public String toString() {
        return super.toString() + "Shoes{" + "material=" + material + ", closing=" + closing + '}';
    }
  

    @Override
   public void mostrar(){
       System.out.println("Estos zapatos son de marca " + brand);
   }
    
    
}
