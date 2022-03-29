package ejercicio3;

import javax.swing.*;

public class principal {
    public static void main(String[] args) {
        cuenta c1 = new cuenta("", 0);

        c1.ingresarCuenta();
        c1.ingresarCantidad();
        c1.mostrarCuenta();
        c1.retirarCantidad();
        c1.mostrarCuenta();

    }
}
