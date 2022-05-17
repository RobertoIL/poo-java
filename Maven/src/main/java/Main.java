import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, Maven");

        Persona p = new Persona("Matia", 12);
        Gson pGson = new Gson();
        String stringJson = pGson.toJson(p);
        System.out.println("stringJson= "+stringJson);

        Persona p2 = pGson.fromJson(stringJson, Persona.class);
        System.out.println("p2= "+p2);

        FileWriter writer;
        try{
            writer = new FileWriter("persona.json");
            Gson gson = new GsonBuilder().create();
            gson.toJson(p, writer);
            writer.close();
        }catch(IOException e){
            System.out.println("No se pudo guardar el archivo");
        }


    }
}
