package clientes;

import clientes.Cliente;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese su nombre: ");
        String nombre = teclado.next();

        System.out.println("ingrese su rut sin puntos ni guion: ");
        float rut = teclado.nextFloat();

        Cliente c1 = new Cliente(nombre, rut);


        c1.generarLibros();
        c1.generarRevistas();
        c1.generarManuales();








    }
}
