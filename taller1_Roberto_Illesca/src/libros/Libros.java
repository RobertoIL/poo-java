package libros;

public class Libros {
    int ibsn;
    String autor;
    String nombre;
    int precio;
    int edadMin;

    public Libros(int ibsn, int autor, String nombre, String precio, int edadMin) {
        this.ibsn = ibsn;
        this.autor = String.valueOf(autor);
        this.nombre = nombre;
        this.precio = Integer.parseInt(precio);
        this.edadMin = edadMin;
    }

    public Libros(String s, int i, String nombre, String s1, int edadMin) {
    }

    @Override
    public String toString() {
        return "Libros{" +
                "ibsn=" + ibsn +
                ", autor='" + autor + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", edadMin=" + edadMin +
                '}';
    }
}
