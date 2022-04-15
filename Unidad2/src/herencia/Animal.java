package herencia;

public class Animal {
    private String nombre;
    private String color;
    private int edad;
    private boolean isDespierto;

    public Animal(String nombre, String color, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    public void comer(String comida){
        System.out.println("comiendo " + comida);
    }
    public void dormir(){
        this.isDespierto = false;
    }
    public void desperta(){
        this.isDespierto = true;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", edad=" + edad +
                ", isDespierto=" + isDespierto +
                '}';
    }
}
