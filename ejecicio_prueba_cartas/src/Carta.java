public class Carta {
    private String pinta;
    private int puntos;
    private String simbolo;

    public Carta(String pinta, int puntos, String simbolo) {
        this.pinta = pinta;
        this.puntos = puntos;
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "pinta='" + pinta + '\'' +
                ", puntos=" + puntos +
                ", simbolo='" + simbolo + '\'' +
                '}';
    }
}
