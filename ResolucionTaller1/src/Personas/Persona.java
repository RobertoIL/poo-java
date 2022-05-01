package Personas;

import java.util.Date;

public class Persona {
    private String nombre;
    private String rut;
    private Date cumple;
    private Date contrato;

    public Persona(String nombre, String rut, Date cumple, Date contrato) {
        this.nombre = nombre;
        this.rut = rut;
        this.cumple = cumple;
        this.contrato = contrato;
    }
}
