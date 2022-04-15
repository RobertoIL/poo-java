package casa.ejercicio1.ejercicio3;

import javax.swing.JOptionPane;

public class cuenta {
    //atributos
    private String titular;
    private double cantidad;

    //contructores
    public cuenta(String titular){
        this.titular = titular;
    }
    public cuenta(String titular, double cantidad){
        this.titular = titular;
        if(cantidad<0){
            this.cantidad = 0;

        }else{
            this.cantidad = cantidad;
        }
    }
    public void mostrarCuenta(){
        System.out.println("Titular: "+titular+"\ncantidad: "+cantidad);
    }
    public void ingresarCuenta(){
        titular = JOptionPane.showInputDialog("ingrese nombre de titular ");
    }
    public void ingresarCantidad(){
        String texto = JOptionPane.showInputDialog("Monto a ingresar");
        cantidad = Double.parseDouble(texto);
    }
    public void retirarCantidad(){
        String texto = JOptionPane.showInputDialog("Monto a retirar");
        cantidad = (cantidad-Double.parseDouble(texto));


    }

}
