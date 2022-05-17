import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {

        //crear una lista que de 8 numeros aleatorios
        //que no se repitan
        //con rango de 1 - 10

        ArrayList<Integer> arreglo = new ArrayList<>();
        llenarArreglo(arreglo, 8, 1, 10);
        System.out.println("arreglo = "+arreglo);

    }

    private static void llenarArreglo(ArrayList<Integer> arreglo, int largo, int incial, int Vfinal) {
        for (int i = 0; i <largo; i++) {
            int num = (int)(Math.random()*largo)+1;
            while(arreglo.contains(num)){
                num = (int)(Math.random()*largo)+1;
            }
            arreglo.add(num);

        }

    }
}
