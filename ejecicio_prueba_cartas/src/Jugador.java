import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private Mano mano;

    public Jugador(String nombre, Mano mano) {
        this.nombre = nombre;
        this.mano = mano;
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", mano=" + mano +
                '}';
    }

    public Mano getMano(Mano mano) {
        return mano;
    }
}
