import java.util.ArrayList;

public class Libro extends Articulo{
    private String tematica;
    private String genero;

    public Libro(String titulo, int precio, String autor, int codigo, boolean hayStock, String tematica, String genero) {
        super(titulo, precio, autor, codigo, hayStock);
        this.tematica = tematica;
        this.genero = genero;
    }


}
