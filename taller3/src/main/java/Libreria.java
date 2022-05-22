import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Scanner;

public class Libreria {
  private String nombre;
  public ArrayList<Libro> libros = new ArrayList<>();
  public ArrayList<Revista> revistas = new ArrayList<>();
  public ArrayList<Diario> diarios = new ArrayList<>();
  public ArrayList<OtroArticulo> otrosArticulos = new ArrayList<>();

    public Libreria(String nombre, ArrayList<Libro> libros, ArrayList<Revista> revistas, ArrayList<Diario> diarios, ArrayList<OtroArticulo> otrosArticulos) {
        this.nombre = nombre;
        this.libros = libros;
        this.revistas = revistas;
        this.diarios = diarios;
        this.otrosArticulos = otrosArticulos;
    }

    public Libreria(ArrayList<Libro> libros, ArrayList<Revista> revistas, ArrayList<Diario> diarios, ArrayList<OtroArticulo> otrosArticulos) {
        this.libros = libros;
        this.revistas = revistas;
        this.diarios = diarios;
        this.otrosArticulos = otrosArticulos;
    }

    public void agregarLibros(Libreria l){
        l.libros.add(new Libro("Don Quijote", 20000, "Cervantes", 1111, true, "Drama", "Novela"));
        l.libros.add(new Libro("CuentosTerror", 12000, "Miguel Angel", 2222, true, "Terror", "Novela"));
    }
    public void agregarRevistas(Libreria l){
        l.revistas.add(new Revista("Moda Libre", 9000, "Angelica", 3333, true, "Tendencias moda"));
        l.revistas.add(new Revista("Revolucion tecnologica", 7000, "Jack", 4444, true, "Tecnologia"));
    }
    public void agregarDocumento(Libreria l){
        l.otrosArticulos.add(new OtroArticulo("Guia de usuario mac", 15000, "Steve Jobs", 5555, true, "Manual"));
    }
    public void mostrarArticulos(Libreria l){
        System.out.println("ARTICULOS DISPONIBLES EN LIBRERIA");
        for (int i = 0; i <l.libros.size() ; i++) {
            String json = new Gson().toJson(l.libros.get(i));
            System.out.println(json);
        }

        for (int i = 0; i <l.revistas.size() ; i++) {
            String json1 = new Gson().toJson(l.revistas.get(i));
            System.out.println(json1);
        }

        String json2 = new Gson().toJson(l.otrosArticulos);
        System.out.println(json2);
    }

    @Override
    public String toString() {
        return "Libreria{" +
                "libros=" + libros +
                '}';
    }

    public Libreria(String nombre) {
        this.nombre = nombre;
    }

    public void prestarLibro(Cliente c, Libro l){
        libros.remove(l);
        c.articulosPrestados.add(l);
        l.setHayStock(false);
        int dias = 20;
        double precio = 2000;
    }
    public void prestarRevista(Cliente c, Revista r){
        revistas.remove(r);
        c.articulosPrestados.add(r);
        r.setHayStock(false);
        int dias = 12;
        double precio = 2000;

    }


}
