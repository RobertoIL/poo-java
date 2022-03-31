package Juego_cartas_clase;

public class Carta {
    private int valor;
    private String simbolo;
    private String pinta;

    public Carta(int valor, String simbolo, String pinta) {
        this.valor = valor;
        this.simbolo = simbolo;
        this.pinta = pinta;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "valor=" + valor +
                ", simbolo='" + simbolo + '\'' +
                ", pinta='" + pinta + '\'' +
                '}';
    }
}
