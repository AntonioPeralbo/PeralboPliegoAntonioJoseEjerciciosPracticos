
package ejerciciosdia5num1.Models;


public class Mammal extends Animal {
    
    int paws;
    String typeOfReproduction;
    String furColor;
    String habitat;

    public Mammal() {
    }

    public Mammal(int id, String name, int age, String skin, String typeOfFeeding , int paws, String typeOfReproduction, String furColor, String habitat) {
        super(id, name, age, skin, typeOfFeeding);
        this.paws = paws;
        this.typeOfReproduction = typeOfReproduction;
        this.furColor = furColor;
        this.habitat = habitat;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public String getTypeOfReproduction() {
        return typeOfReproduction;
    }

    public void setTypeOfReproduction(String typeOfReproduction) {
        this.typeOfReproduction = typeOfReproduction;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() +  "Mammal{" + "paws=" + paws + ", typeOfReproduction=" + typeOfReproduction + ", furColor=" + furColor + ", habitat=" + habitat + '}';
    }

    
    
    @Override
   public void saludar() {
       System.out.println("Hola, soy un mamifero");
   }
    
    
    
}
