
package ejerciciosdia5num2.Models;


public class Shirt extends Outfit {
    
    String sleeve;
    String collar;

    public Shirt() {
    }

    public Shirt(String sleeve, String collar, int code, String name, double price, String brand, String size, String color) {
        super(code, name, price, brand, size, color);
        this.sleeve = sleeve;
        this.collar = collar;
    }

    public String getSleeve() {
        return sleeve;
    }

    public void setSleeve(String sleeve) {
        this.sleeve = sleeve;
    }

    public String getCollar() {
        return collar;
    }

    public void setCollar(String collar) {
        this.collar = collar;
    }

    @Override
    public String toString() {
        return super.toString() + "Shirt{" + "sleeve=" + sleeve + ", collar=" + collar + '}';
    }
    
     @Override
   public void mostrar(){
       System.out.println("Esta camiseta son de marca " + sleeve);
}
}