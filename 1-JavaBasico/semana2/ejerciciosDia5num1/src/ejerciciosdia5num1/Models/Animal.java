
package ejerciciosdia5num1.Models;


public class Animal {
    
    int id;
    String name;
    int age;
    String skin;
    String typeOfFeeding;

    public Animal() {
    }

    public Animal(int id, String name, int age, String skin, String typeOfFeeding) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.skin = skin;
        this.typeOfFeeding = typeOfFeeding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getTypeOfFeeding() {
        return typeOfFeeding;
    }

    public void setTypeOfFeeding(String typeOfFeeding) {
        this.typeOfFeeding = typeOfFeeding;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", name=" + name + ", age=" + age + ", skin=" + skin + ", typeOfFeeding=" + typeOfFeeding + '}';
    }
    
    public void saludar(){
        System.out.println("Hola, soy un animal");
    }
    
}
