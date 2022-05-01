import java.util.ArrayList;
import java.util.Random;

public class Mano {
    private Mazo mazo;

    public void getPuntos(){

    }

    public void robarCartas(Mazo mazo, int cantidad){
        Random rnum = new Random();
        for (int i = 0; i <cantidad; i++) {
            int numero = rnum.nextInt(mazo.getMazo().size());

        }

    }
}
