public class Cliente {
    private String nombre;
    private String rut;
    private String embalajeSolic;
    private String empresa;

    public Cliente(String nombre, String rut, String embalajeSolic, String empresa) {
        this.nombre = nombre;
        this.rut = rut;
        this.embalajeSolic = embalajeSolic;
        this.empresa = empresa;
    }

    public Cliente(String nombre, String rut, String empresa) {
        this.nombre = nombre;
        this.rut = rut;
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", embalaje='" + embalajeSolic + '\'' +
                ", tipo='" + empresa + '\'' +
                '}';
    }
}
