import java.util.ArrayList;
import java.util.Random;

public class Mazo {
    ArrayList<Carta> mazo = new ArrayList<>();

    public Mazo(int nMazo) {
        crearMazo(this.mazo,nMazo );
    }

    public ArrayList<Carta> getMazo(){
        return mazo;
    }

    public void crearMazo(ArrayList<Carta> mazo, int nMazo) {
        String[] pintas = {"trebol", "corazon", "diamante", "pica"};
        String[] simbolo = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"};
        int[] puntos = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10};
        for (int i = 0; i < pintas.length; i++) {
            for (int j = 0; j < simbolo.length; j++) {
                for (int k = 0; k < puntos.length; k++) {
                    mazo.add(new Carta(pintas[i], puntos[k], simbolo[j]));
                }
            }
        }
    }


}
