import javax.swing.*;

public class Animal {
    private String nombre;
    private String color;
    private int edad;
    private boolean despierto;

    public Animal(String nombre, String color, int edad, boolean despierto) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.despierto = despierto;
    }
    public void comer(String comida){
        comida = JOptionPane.showInputDialog("ingrese comida");
        System.out.println("comiendo "+comida);
    }

    public boolean isDespierto(boolean despierto){
        return true;
    }
    public boolean isDormido(boolean despierto){
        return false;
    }
}
