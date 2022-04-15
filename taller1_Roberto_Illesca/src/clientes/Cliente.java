package clientes;

import libros.Libros;
import manuales.Manual;
import revistas.Revista;

import javax.swing.*;
import java.io.OptionalDataException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private String nombre;
    private float rut;
    private OptionalDataException edadMin;

    public Cliente(String nombre, float rut) {
        this.nombre = nombre;
        this.rut = rut;
    }



    ArrayList<Libros> libros = new ArrayList<>();
    ArrayList<Revista> revistas = new ArrayList<>();
    ArrayList<Manual> manuales = new ArrayList<>();

    public Cliente(String nombre, float rut, ArrayList<Libros> libros) {
        this.nombre = nombre;
        this.rut = rut;
        this.libros = libros;
    }

    public void generarLibros() {
        int[] isbn = {1234, 4321, 1432, 2134};
        String[] nombre = {"Atardecer", "Noche oscura", "Cuentos infantiles", "Novela romantica", ""};
        String[] autor = {"Juanito Perez", "Jose Soto", "Camila Fuentes", "Francisco Salazar"};
        int[] precio = {12000, 15000, 6000, 2000};
        int[] edadMin = {15, 18, 8, 18};

        for (int i = 0; i < isbn.length; i++) {
            for (int j = 0; j < nombre.length; j++) {
                for (int k = 0; k < autor.length; k++) {
                    for (int l = 0; l < precio.length; l++) {
                        for (int m = 0; m < edadMin.length; m++) {
                            libros.add(new Libros(edadMin[m], precio[l], autor[k], nombre[j], isbn[i]));
                            for (int n = 0; n < libros.size(); n++) {
                                System.out.println(libros.get(n));
                            }
                        }
                    }
                }
            }
        }
    }



        public void generarRevistas() {
                int[] isbn1 = {4321, 2413, 5474, 7346};
                String[] nombre1 = {"Fisica cuantica", "Ultimas de la moda", "musica a todas horas", "lo mejor del futbol"};
                String[] autor1 = {"Juanito Rosas", "Juan Soto", "Jose Fuentes", "Patricio Salazar"};
                int[] precio1 = {12000, 15000, 6000, 2000};
                String[] tematica1 = {"ciencia", "farandula", "hobbie", "entretenimiento"};

                for (int i = 0; i < isbn1.length; i++) {
                    for (int j = 0; j < nombre1.length; j++) {
                        for (int k = 0; k < autor1.length; k++) {
                            for (int l = 0; l < precio1.length; l++) {
                                for (int m = 0; m < tematica1.length; m++) {
                                    revistas.add(new Revista(tematica1[m], precio1[l], autor1[k], nombre1[j], isbn1[i]));

                                    for (int n = 0; n < revistas.size(); n++) {
                                        System.out.println(revistas.get(n));
                                    }
                                }
                            }
                        }
                    }
                }
            }


            public void generarManuales(){
                int[] isbn2 = {4523, 8782, 5647, 3462};
                String[] nombre2 = {"Cocina para todos", "programacion en java", "manual de obra de cimientos", "como eliminar grasa"};
                String[] autor2 = {"Pino Prestanizi", "Francisco Escobar", "Juan Herrera", "Nicolas Soto"};
                int[] precio2 = {12000, 15000, 6000, 2000};
                String[] areaAplicacion2 = {"gastronimia", "informatica", "construccion", "Salud"};
                for (int i = 0; i < isbn2.length; i++) {
                    for (int j = 0; j < nombre2.length; j++) {
                        for (int k = 0; k < autor2.length; k++) {
                            for (int l = 0; l < precio2.length; l++) {
                                for (int m = 0; m < areaAplicacion2.length; m++) {
                                    manuales.add(new Manual(areaAplicacion2[m], precio2[l], autor2[k], nombre2[j], isbn2[i]));
                                    for (int n = 0; n < manuales.size(); n++) {
                                        System.out.println(manuales.get(n));
                                    }
                                }
                            }
                        }
                    }
                }


            }
        }



