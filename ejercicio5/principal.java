package ejercicio5;

import javax.swing.*;

public class principal {
    public static void main(String[] args) {

        //cuadrilatero 1
        float lado1, lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("ingrese lado 1"));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("ingrese lado 2"));

        cuadrilatero c1 = new cuadrilatero(lado1, lado2);

        c1.getPerimetro();
        c1.getArea();
        c1.Mostrar();
    }
}
