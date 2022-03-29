package ejercicio6;

import clase.Persona;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        //Entrada de datos
        String nombre = JOptionPane.showInputDialog("ingrese nombre");
        String texto = JOptionPane.showInputDialog("ingrese edad");
        int edad = Integer.parseInt(texto);
        texto = JOptionPane.showInputDialog("ingrese su peso en Kg");
        float peso = Float.parseFloat(texto);
        texto = JOptionPane.showInputDialog("ingrese su estatura en m");
        float estatura = Float.parseFloat(texto);

        //creacion de objeto t1
        Titular t1 = new Titular();

        //asignacion a los atributos
        t1.setNombre(nombre);
        t1.setEdad(edad);
        t1.setPeso(peso);
        t1.setEstatura(estatura);





        System.out.println("t1 = " + t1);



    }
}
