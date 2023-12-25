
package ejerciciosdia5num2.Models;


public class Hat extends Outfit {
    
    String type;
    String sizeHat;

    public Hat() {
    }

    public Hat(String type, String sizeHat, int code, String name, double price, String brand, String size, String color) {
        super(code, name, price, brand, size, color);
        this.type = type;
        this.sizeHat = sizeHat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSizeHat() {
        return sizeHat;
    }

    public void setSizeHat(String sizeHat) {
        this.sizeHat = sizeHat;
    }

    @Override
    public String toString() {
        return super.toString() + "Hat{" + "type=" + type + ", sizeHat=" + sizeHat + '}';
    }

   @Override
   public void mostrar(){
       System.out.println("Este sombrero es de marca " + type);
   
   } 
    
   
}
