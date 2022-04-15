package juego_de_cartas;

import java.util.ArrayList;

public class Mazo {

    //metodo para generar mazos
    private void generaMazo(ArrayList<Carta> mazo, int nMazo) {
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


}
