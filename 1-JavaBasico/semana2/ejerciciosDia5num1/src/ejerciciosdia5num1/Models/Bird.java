
package ejerciciosdia5num1.Models;


public class Bird extends Animal{
    
    int wingspan;
    String typeOfFlight;
    String plumageColor;
    String beakType;

    public Bird() {
    }

    public Bird(int id, String name, int age, String skin, String typeOfFeeding, int wingspan, String typeOfFlight, String plumageColor, String beakType) {
        super(id, name, age, skin, typeOfFeeding);
         this.wingspan = wingspan;
        this.typeOfFlight = typeOfFlight;
        this.plumageColor = plumageColor;
        this.beakType = beakType;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public String getTypeOfFlight() {
        return typeOfFlight;
    }

    public void setTypeOfFlight(String typeOfFlight) {
        this.typeOfFlight = typeOfFlight;
    }

    public String getPlumageColor() {
        return plumageColor;
    }

    public void setPlumageColor(String plumageColor) {
        this.plumageColor = plumageColor;
    }

    public String getBeakType() {
        return beakType;
    }

    public void setBeakType(String beakType) {
        this.beakType = beakType;
    }

    
   @Override
   public void saludar() {
       System.out.println("Hola, soy un ave");
   }
    
}
