public class Congelados extends Producto{
    private String metodCongelamiento;

    public Congelados(String nombre, double peso, double temperaturaEnvasado, String metodCongelamiento) {
        super(nombre, peso, temperaturaEnvasado);
        this.metodCongelamiento = metodCongelamiento;
    }
}
