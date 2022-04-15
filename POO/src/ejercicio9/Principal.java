package ejercicio9;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese primer numero");
        int n1 = teclado.nextInt();

        System.out.println("ingrese segundo numero");
        int n2 = teclado.nextInt();

        System.out.println("ingrese tercer numero");
        int n3 = teclado.nextInt();


        Max m1 = new Max(n1, n2, n3);


        System.out.println(m1);

        m1.obtenerMax();



    }


}
