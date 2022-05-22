public class OtroArticulo extends Articulo{
    private String clasificacion;

    public OtroArticulo(String titulo, int precio, String autor, int codigo, boolean hayStock, String clasificacion) {
        super(titulo, precio, autor, codigo, hayStock);
        this.clasificacion = clasificacion;
    }


}
