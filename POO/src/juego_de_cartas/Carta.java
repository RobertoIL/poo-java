package juego_de_cartas;
import java.util.ArrayList;

public class Carta {
    int valor;
    String pinta;
    String simbolo;

    public Carta(int valor, String pinta, String simbolo) {
        this.valor = valor;
        this.pinta = pinta;
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "valor=" + valor +
                ", pinta='" + pinta + '\'' +
                ", simbolo='" + simbolo + '\'' +
                '}';
    }
}
