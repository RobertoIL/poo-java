package juego_de_cartas;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Carta> mazo = new ArrayList<>();

        //generar mazo de cartas, cada mazo tiene 52 cartas
        generaMazo(mazo, 2);
        System.out.println(mazo.size());

        ArrayList<Carta> mano = new ArrayList<>();

        sacarCarta(mazo, mano, 3);

        System.out.println("mano = "+ mano);


        //String n1 = JOptionPane.showInputDialog("ingrese su nombre");

        //Persona p1 = new Persona(n1, mano, 0);

        //System.out.println("p1 = "+p1);



    }

    //metodo para generar mazos
    private static void generaMazo(ArrayList<Carta> mazo, int nMazo) {
        String[] pintas = {"trebol", "diamante", "corazon", "pica" };
        String[] simbolo = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k"};
        int[] valores = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

        for (int k = 0; k <nMazo ; k++) {
            for (int i = 0; i < pintas.length ; i++) {
                for (int j = 0; j < simbolo.length ; j++) {
                    mazo.add(new Carta(valores[j], simbolo[j], pintas[i]));
                }
            }
            for (int i = 0; i < mazo.size() ; i++) {
                System.out.println(mazo.get(i));
            }
        }
    }
    //metodo para sacar cartas
    private static void sacarCarta(ArrayList<Carta> mazo, ArrayList<Carta> mano, int nCartas) {
        Random rnum = new Random();
        for (int i=0; i<nCartas; i++){
            int numero = rnum.nextInt(mazo.size());
            mano.add(mazo.get(numero));
            mazo.remove(numero);
        }
    }
}
