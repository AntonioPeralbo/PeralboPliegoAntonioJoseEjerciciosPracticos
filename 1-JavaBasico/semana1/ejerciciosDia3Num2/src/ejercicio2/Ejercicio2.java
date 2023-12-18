package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
//       Crear una clase Persona, que tenga los siguientes atributos: id, nombre, edad, dirección y número de teléfono (tener en cuenta todos sus atributos, constructores y métodos getters y setters).
//
//a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.
//
//b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.
//
//c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y luego mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados.
//
//d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años. 

        Persona persona1 = new Persona(1, "Javier", 33, "calle1", 123456789);
        Persona persona2 = new Persona(2, "Martin", 26, "avenida1", 987654321);
        Persona persona3 = new Persona(3, "Almudena", 35, "zona2", 192837465);
        Persona persona4 = new Persona(4, "Antonio", 65, "diagonal 1", 918273645);
        Persona persona5 = new Persona(5, "Rosa", 60, "paseo 1", 921864375);

        Persona[] persona = new Persona[5];

        persona[0] = persona1;
        persona[1] = persona2;
        persona[2] = persona3;
        persona[3] = persona4;
        persona[4] = persona5;

        for (int i = 0; i < persona.length; i++) {
            System.out.println(" El nombre y edad es :" + persona[i].getNombre() + " " + persona[i].getEdad());
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(" los nombres de cambiados son : "+ persona[i].getNombre());

        }
        persona1.setNombre("Raul");
        persona2.setNombre("Pepe");

        for (int i = 0; i < 2; i++) {

            System.out.println(" el nuevo nombre es : " + persona[i].getNombre());

        }
        
        
        for (int i = 0; i < persona.length; i++) {
            if (persona[i].getEdad() > 30) {
                System.out.println( persona[i].getNombre()+ " tinene más de 30 años");
            }
            ;
        }

    }

}
