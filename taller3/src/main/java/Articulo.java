public abstract class Articulo {
    private String titulo;
    private int precio;
    private String autor;
    private int codigo;
    private boolean hayStock;

    public Articulo() {
    }

    public Articulo(String titulo, int precio, String autor, int codigo, boolean hayStock) {
        this.titulo = titulo;
        this.precio = precio;
        this.autor = autor;
        this.codigo = codigo;
        this.hayStock = hayStock;
    }

    public boolean isHayStock() {
        return hayStock;
    }

    public void setHayStock(boolean hayStock) {
        this.hayStock = hayStock;
    }
}
