package Juego_cartas_clase;

import java.util.ArrayList;
import java.util.Random;

public class Mazo {
    ArrayList<Carta> mazo = new ArrayList<>();

    public Mazo(int nMazo) {
        generarMazo(this.mazo,nMazo );
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void generarMazo(ArrayList<Carta> mazo, int nMazo) {

        String[] pintas = {"Trebol", "Diamante", "Corazon", "Pica"};
        String[] simbolos = {"A", "2", "3", "4", "5", "6","7","8","9","10","J", "Q", "K" };
        int[] valores = {11,2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };
        for (int k =0;k<nMazo;k++){
            for (int i = 0; i < pintas.length; i++) {
                for (int j = 0; j < simbolos.length; j++) {
                    mazo.add(new Carta(valores[j], simbolos[j], pintas[i]));
                }
            }
        }

    }

    public void sacarCarta(ArrayList<Carta> mano, int nCartas) {
        Random rnum = new Random();
        for(int i=0; i<nCartas; i++){
            int numero = rnum.nextInt(mazo.size());
            mano.add(mazo.get(numero));
            mazo.remove(numero);
        }
    }
}
