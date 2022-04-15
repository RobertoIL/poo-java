package herencia;

public class Gato extends Animal {
    private int bigote;
    private String raza;

    public Gato(String nombre, String color, int edad, int bigote, String raza) {
        super(nombre, color, edad);
        this.bigote = bigote;
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "bigote=" + bigote +
                ", raza='" + raza + '\'' +
                '}';
    }
}