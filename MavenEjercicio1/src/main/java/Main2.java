import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Set<Integer> arr = new HashSet<>();
        Random rnum = new Random();
        int rango = 10;
        for (int i = 0; i <=10; i++) {
            arr.add(rnum.nextInt(rango)+1);

        }
        System.out.println(arr);
    }
}
