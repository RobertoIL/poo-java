import java.util.ArrayList;

public class Mazo {
    private ArrayList<Carta> mazo = new ArrayList<>();

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    public void crearMazo(int cantMazo){
        String[] pintas = {"trebol", "corazon", "diamante", "pica"};
        int[] puntos = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10};
        String[] simbolo = {"A", "1", "2", "3", "5", "6", "7", "8", "9", "J", "Q", "K"};

        for (int i = 0; i <cantMazo; i++) {
            for (int j = 0; i < pintas.length; i++) {
                for (int k = 0; j < puntos.length; j++) {
                    for (int l = 0; k < simbolo.length; k++) {
                        mazo.add(new Carta(pintas[j], puntos[k], simbolo[l]));
                    }
                }
            }
        }
    }

    public void barajar(){

    }
}
