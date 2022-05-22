import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Libreria libreria = new Libreria("libreria001");

       //creacion 2 libros
        libreria.agregarLibros(libreria);

        //creacion 2 revistas
        libreria.agregarRevistas(libreria);

        //creacion documento
        libreria.agregarDocumento(libreria);


        //creacion 2 organizaciones
        Empresa e1 = new Empresa("UFRO", "111.111.111-1", "Universidad", 0.3, 0.3);
        Empresa e2 = new Empresa("Fashion", "222.222.222-2", "Empresa", 0.15, 0.15);

        //mostrar articulos disponibles en la libreria
        System.out.println("PRIMERA PARTE GENERACION DE LIBROS, REVISTAS Y DOCUMENTOS");
        libreria.mostrarArticulos(libreria);

        //prestar libros
        System.out.println("SEGUNDA PARTE PRESTAMO DE 2 DOCUMENTOS, EN ESTE CASO 1 LIBRO Y 1 REVISTA");
        libreria.prestarLibro(e1, libreria.libros.get(0));
        libreria.prestarRevista(e1, libreria.revistas.get(0));

        //mostra articulos obtenidos prestados por la empresa
        e1.mostarArticulosprestados(e1);

        //mostrar articulos disponibles en la libreria
        libreria.mostrarArticulos(libreria);






    }
}
