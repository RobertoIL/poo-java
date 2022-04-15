package Juego_cartas_clase;

import java.util.ArrayList;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Mazo m0 = new Mazo(1);
        Jugador j1 = new Jugador("Jose");
        m0.sacarCarta(j1.getMano(),1);
        System.out.println(j1.getMano());


    }




}
