package ejercicio5;

public class cuadrilatero {
    private float lado1;
    private float lado2;

    public cuadrilatero(float lado1) {
        this.lado1 = lado1;
    }

    public cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public float getArea(){
     float area = lado1*lado2;
     return area;
    }
    public float getPerimetro(){
        float perimetro = 2*(lado1 + lado2);
        return perimetro;
    }

    public void Mostrar(){
        System.out.println("El area es: "+getArea());
        System.out.println("El perimetro es: "+getPerimetro());
    }
}
