public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();
        Mazo mazo = new Mazo();
        Mano mano = new Mano();
        juego.nuevoJuego(mazo, mano);
    }
}
