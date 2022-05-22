import java.util.ArrayList;

public  abstract class Cliente {
    private String nombre;
    private String rut;

    public Cliente() {
    }

    public Cliente(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }


    ArrayList<Articulo> articulosPrestados = new ArrayList<>();



}
