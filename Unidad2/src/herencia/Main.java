package herencia;

public class Main {
    public static void main(String[] args) {

        Animal a0 = new Animal("michi", "plomo", 3);
        Animal a1 = new Animal("cachupin", "negro", 10);

        a1.comer("comida para perro");
        a0.comer("wiskas");

        Gato g0 = new Gato("Diana", "blanco", 4, 6, "Angora");

        g0.comer("lauchas");

        Cocodrilo c0 = new Cocodrilo("coco", "verde", 7, 50, 4);
        c0.comer(g0.toString());
        c0.comer(a0.toString());

    }
}
