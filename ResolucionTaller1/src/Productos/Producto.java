package Productos;

import Personas.Persona;

public class Producto {
    private String nombre;
    private int codigo;
    private int precio;
    private Persona autor;
    private int edad;
    private String genero;
    private String aplicacion;
    private String tematica;
    private String tipo;

    public Producto(String nombre, int codigo, int precio, Persona autor, int edad, String genero, String aplicacion, String tematica, String tipo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.autor = autor;
        this.edad = edad;
        this.genero = genero;
        this.aplicacion = aplicacion;
        this.tematica = tematica;
        this.tipo = tipo;
    }

    public void ingresarProducto(){

    }
}
