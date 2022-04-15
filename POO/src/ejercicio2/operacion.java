package casa.ejercicio1.ejercicio2;

import javax.swing.*;

public class operacion {

    //atributos
    int num1;
    int num2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //metodos

    public void leeNum() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero 1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero 2"));
    }
    public void sumar() {
        suma = (num1+num2);
    }

    public void restar() {
        resta = (num1-num2);
    }

    public void multiplicar() {
        multiplicacion = (num1*num2);
    }
    public void dividir() {
        division = (num1/num2);
    }
    public void resultant() {
        System.out.println("la suma es "+suma);
        System.out.println("la resta es "+resta);
        System.out.println("la multiplicacion es "+multiplicacion);
        System.out.println("la division es "+division);
    }



}
