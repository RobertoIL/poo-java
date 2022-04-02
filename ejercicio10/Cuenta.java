package ejercicio10;

import javax.swing.*;

public class Cuenta {
    private String nombre;
    private String nCuenta;
    private double interes;
    private double saldo;


    public Cuenta() {
        this.nombre = nombre;
        this.nCuenta = nCuenta;
        this.interes = interes;
        this.saldo = saldo;
    }


    //Mostrar informacion de la cuenta registrada
    @Override
    public String toString() {
        return "Cuenta{" +
                "nombre='" + nombre + '\'' +
                ", nCuenta='" + nCuenta + '\'' +
                ", interes=" + interes +
                ", saldo=" + saldo +
                '}';
    }

    public double ingresar(double montoIngreso){
        setSaldo(saldo+montoIngreso);
        return montoIngreso;
    }

    public double retirar(double montoRetiro){
        if (saldo>0 && montoRetiro<=saldo){
            setSaldo(saldo-montoRetiro);
        }
        else{
            System.out.println("no se pudo realizar la operacion");
        }
        return montoRetiro;
    }






    public void loginCuenta(){
        String texto = JOptionPane.showInputDialog("ingrese su nombre");
        setNombre(texto);
        String texto1 = JOptionPane.showInputDialog("ingrese su numero de cuenta");
        setnCuenta(texto1);
    }





    public Cuenta(String nombre, String nCuenta, double interes, double saldo) {
        this.nombre = nombre;
        this.nCuenta = nCuenta;
        this.interes = interes;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(String nCuenta) {
        this.nCuenta = nCuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo(double ingreso) {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



}
