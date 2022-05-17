import java.util.HashMap;
import java.util.Map;

public class Main5 {
    public static void main(String[] args) {

        Map<String, Vehiculo> arr = new HashMap<>();

        Vehiculo v0 = new Vehiculo("1q2w3e", 4, "negro");

        arr.put(v0.getPatente(), v0);

        Vehiculo v1 = new Vehiculo("6y7u8i", 4, "rojo");
        Vehiculo v2 = new Vehiculo("4r5t6y", 4, "cafe");
        Vehiculo v3 = new Vehiculo("e3r4t5", 4, "blanco");

        arr.put(v1.getPatente(), v1);
        arr.put(v2.getPatente(), v2);
        arr.put(v3.getPatente(), v3);
        System.out.println("arr = "+arr);




    }
}
