package herencia;

public class Cocodrilo extends Animal {
    private int dientes;
    private int largo;

    public Cocodrilo(String nombre, String color, int edad, int dientes, int largo) {
        super(nombre, color, edad);
        this.dientes = dientes;
        this.largo = largo;
    }

    @Override
    public void comer(String comida){
        System.out.println("masticando " + comida);
    }
}
