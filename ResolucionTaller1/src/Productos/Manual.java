package Productos;

import Personas.Persona;

public class Manual extends Producto{

    public Manual(String nombre, int codigo, int precio, Persona autor, int edad, String genero, String aplicacion, String tematica, String tipo) {
        super(nombre, codigo, precio, autor, edad, genero, aplicacion, tematica, tipo);
    }
}
