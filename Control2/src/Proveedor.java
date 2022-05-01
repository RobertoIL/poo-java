import java.util.ArrayList;

public class Proveedor {
    private String nombre;
    private String rut;
    private String embalaje;
    private int kgproducto;
    ArrayList<Producto> productos;


    public Proveedor(String nombre, String rut, String embalaje, int kmproducto) {
        this.nombre = nombre;
        this.rut = rut;
        this.embalaje = embalaje;
        this.kgproducto = kmproducto;
    }

    public Proveedor(String nombre, String rut, int kmproducto) {
        this.nombre = nombre;
        this.rut = rut;
        this.kgproducto = kmproducto;
    }

    public void generarProductos(Producto producto){
        productos.add(new Frios("carne", 2, 5, true));
        productos.add(new Congelados("berries", 1, -10, "frigorifico"));
        productos.add(new Frescos("verduras mixtas", 0.5, 15));
        System.out.println(producto);
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", embalaje='" + embalaje + '\'' +
                ", kgproducto=" + kgproducto +
                ", productos=" + productos +
                '}';
    }
}
