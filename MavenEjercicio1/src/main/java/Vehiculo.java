public class Vehiculo {
    private String patente;
    private int ruedas;
    private String color;

    public Vehiculo(String patente, int ruedas, String color) {
        this.patente = patente;
        this.ruedas = ruedas;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", ruedas=" + ruedas +
                ", color='" + color + '\'' +
                '}';
    }

    public String getPatente() {
        return patente;
    }
}
