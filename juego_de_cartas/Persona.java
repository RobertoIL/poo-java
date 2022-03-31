package juego_de_cartas;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private int mano;
    private int puntaje = 0;

    public Persona(String nombre, int mano, int puntaje) {
        this.nombre = nombre;
        this.mano = mano;
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", mano=" + mano +
                ", puntaje=" + puntaje +
                '}';
    }




    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    private void agregarPtje(){
        //math.max
    }
}




