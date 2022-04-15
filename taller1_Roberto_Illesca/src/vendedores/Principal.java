package vendedores;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese su nombre: ");
        String nombre = teclado.next();

        System.out.println("ingrese su rut");
        float rut = teclado.nextFloat();

        Vendedor v1 = new Vendedor(nombre, rut);





    }
}
