
package ejerciciosdia5num2.Models;


public class Pants extends Outfit {
    
    String style;
    String typeOfFrabric;

    public Pants() {
    }

    public Pants(String style, String typeOfFrabric, int code, String name, double price, String brand, String size, String color) {
        super(code, name, price, brand, size, color);
        this.style = style;
        this.typeOfFrabric = typeOfFrabric;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getTypeOfFrabric() {
        return typeOfFrabric;
    }

    public void setTypeOfFrabric(String typeOfFrabric) {
        this.typeOfFrabric = typeOfFrabric;
    }

    @Override
    public String toString() {
        return super.toString() +  "trouser{" + "style=" + style + ", typeOfFrabric=" + typeOfFrabric + '}';
    }
    
     @Override
   public void mostrar(){
       System.out.println("Estos pantalones son de marca " + style);
}
}