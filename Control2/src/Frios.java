public class Frios extends Producto {
    private boolean siCongelar;
    public Frios(String nombre, double peso, double temperaturaEnvasado, boolean siCongelar) {
        super(nombre, peso, temperaturaEnvasado);
        this.siCongelar = siCongelar;
    }
}
