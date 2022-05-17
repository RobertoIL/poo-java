import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GestorArchivo {

    public static void crearArchivo(String ruta, String contenido){
        Path p = Paths.get(ruta);
        try{
            Files.write(p, contenido.getBytes());
        }catch(IOException e){
            System.out.println("No se pudo leer el archivo");
        }
    }

    public static String leerArchivo(String ruta){
        String contenido = "";
        Path p = Paths.get(ruta);
        try{
            contenido = new String(Files.readAllBytes(p));
        }catch(IOException e){
            System.out.println("No se pudo leer el archivo");
        }
        return contenido;
    }
}
