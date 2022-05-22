import java.util.ArrayList;

public class Revista extends Articulo {
    private String tematica;

    public Revista(String titulo, int precio, String autor, int codigo, boolean hayStock, String tematica) {
        super(titulo, precio, autor, codigo, hayStock);
        this.tematica = tematica;
    }


}
