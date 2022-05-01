import java.util.ArrayList;
import java.util.Random;

public class Mano {
    ArrayList<Carta> mano = new ArrayList<>();


    public void robarCarta(Mazo m, ArrayList<Carta> mazo, int nCartas){
        Random rnum = new Random();
        for (int i = 0; i <nCartas; i++) {
            int numero = rnum.nextInt(mano.size());
            mano.add(mazo.get(numero));
            mazo.remove(numero);
        }
    }


}



