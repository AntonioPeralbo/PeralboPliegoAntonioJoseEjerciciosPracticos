
package ejerciciosdia5num1.Models;


public class Reptile extends Animal {
    
    float length;
    String flakeType;
    String typePoison;
    String habitat;

    public Reptile() {
    }

    public Reptile(int id, String name, int age, String skin, String typeOfFeeding, float length, String flakeType, String typePoison, String habitat) {
        super(id, name, age, skin, typeOfFeeding);
        this.length = length;
        this.flakeType = flakeType;
        this.typePoison = typePoison;
        this.habitat = habitat;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public String getFlakeType() {
        return flakeType;
    }

    public void setFlakeType(String flakeType) {
        this.flakeType = flakeType;
    }

    public String getTypePoison() {
        return typePoison;
    }

    public void setTypePoison(String typePoison) {
        this.typePoison = typePoison;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
   public void saludar() {
       System.out.println("Hola, soy un reptil");
   }
    
    
}
