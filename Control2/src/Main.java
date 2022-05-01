import javax.print.attribute.standard.JobOriginatingUserName;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //REGISTRAR PROVEEDOR
        System.out.println("REGISTRO PROVEEDOR");
        String nombre = JOptionPane.showInputDialog("ingrese nombre");
        String rut = JOptionPane.showInputDialog("ingrese rut");
        int kilos = Integer.parseInt(JOptionPane.showInputDialog("ingrese cunatos kilos vendera"));

        Proveedor p0 = new Proveedor(nombre, rut, kilos);


        //REGISTRO CLIENTE
        System.out.println("REGISTRO CLIENTE");
        String nombre1 = JOptionPane.showInputDialog("ingrese nombre");
        String empresa = JOptionPane.showInputDialog("Empresa o persona natural");

        String rut1 = JOptionPane.showInputDialog("ingrese rut de "+ empresa);

        Cliente c0 = new Cliente(nombre1, rut1, empresa);

        Frigorifico f0 = new Frigorifico("Frigorifico holaaa", p0, c0);

        f0.facturaCliente(c0);

        //System.out.println(p0.productos);

    }
}
