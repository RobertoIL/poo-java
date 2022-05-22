public class Diario extends Articulo{
    private String periodoPublicacion;

    public Diario(String titulo, int precio, String autor, int codigo, boolean hayStock, String periodoPublicacion) {
        super(titulo, precio, autor, codigo, hayStock);
        this.periodoPublicacion = periodoPublicacion;
    }

    public Diario() {
    }
}
