public class ComponenteAuto {

    private String descripcion;
    private int peso;
    private int costo;

    public ComponenteAuto(String descripcion, int peso, int costo) {
        this.descripcion = descripcion;
        this.peso = peso;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "ComponenteAuto{" +
                "descripcion='" + descripcion + '\'' +
                ", peso=" + peso +
                ", costo=" + costo +
                '}';
    }
}
