import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juanito", 43));
        personas.add(new Persona("Pedro", 19));
        personas.add(new Persona("Diego", 15));
        personas.add(new Persona("Ermenejildo", 21));

        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}
