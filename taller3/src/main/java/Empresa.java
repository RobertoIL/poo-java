import com.google.gson.Gson;

import java.util.ArrayList;

public class Empresa extends Cliente implements Beneficios{
   private String clasificacion;
   private double descuentoCompra;
   private double descuentoArreiendo;

    public Empresa(String nombre, String rut, String clasificacion, double descuentoCompra, double descuentoArreiendo) {
        super(nombre, rut);
        this.clasificacion = clasificacion;
        this.descuentoCompra = descuentoCompra;
        this.descuentoArreiendo = descuentoArreiendo;
    }



    public void mostarArticulosprestados(Empresa e){
        System.out.println("ARTICULOS PRESTADOS");
        for (int i = 0; i <e.articulosPrestados.size(); i++) {
            String json = new Gson().toJson(e.articulosPrestados.get(i));
            System.out.println(json);
        }
    }
}
