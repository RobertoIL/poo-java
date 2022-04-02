package ejercicio10;

import javax.swing.*;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {

        Cuenta c1 = new Cuenta();

        c1.loginCuenta();

        //para el ejemplo le asignaremos estos valores a la cuenta
        c1.setInteres(10.2);
        c1.setSaldo(2000);

        System.out.println(c1);

        //operacion a realizar
        int op1;
        do {
            int seleccion = JOptionPane.showInternalOptionDialog(null,
                    "Seleccione opcion",
                    "Selector de opciones",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Ingreso", "Retiro"}, "Ingreso");

            if (seleccion == 0) {
                String texto = JOptionPane.showInputDialog("digite el monto a ingresar");
                double montoIngreso = Double.parseDouble(texto);
                c1.ingresar(montoIngreso);
            } else {
                String texto = JOptionPane.showInputDialog("Digite el monto a retirar");
                double montoRetiro = Double.parseDouble(texto);
                c1.retirar(montoRetiro);
            }
            op1 = JOptionPane.showInternalOptionDialog(null, "Seleccione opcion",
                    "selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Continuar", "Salir"}, "Continuar");

        } while (op1 == 0);

        System.out.println(c1);
        System.exit(1);

    }




}

