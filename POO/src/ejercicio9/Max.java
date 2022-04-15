package ejercicio9;

public class Max {

    //atributos
    public int n1;
    public int n2;
    public int n3;


    public Max(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }



    @Override
    public String toString() {
        return "Max{" +
                "n1=" + n1 +
                ", n2=" + n2 +
                ", n3=" + n3 +
                '}';
    }

    public void obtenerMax() {
        int[] numeros = {n1, n2, n3};

        int nMax = numeros[0];

        for (int i = 0; i < numeros.length ; i++) {
            if (numeros[i]>nMax){
                nMax = numeros[i];
            }

        }
        System.out.println("numero maximo es "+nMax);
    }
}
