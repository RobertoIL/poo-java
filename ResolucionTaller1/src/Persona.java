import java.util.Date;

public class Persona {
    private String nombre;
    private String rut;
    private Date cumple;
    private Date contrato;
    private String tipo;

    public Persona(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        switch (this.tipo) {
            case "Vendedor" -> this.contrato = contrato;
            case "Cliente" -> this.cumple = cumple;
        }
    }

    public Persona(String nombre, String rut, Date cumple, String tipo) {
        this.nombre = nombre;
        this.rut = rut;
        this.cumple = cumple;
        this.tipo = tipo;
    }


}
