package Pokemon;

public class Principal {
    public static void main(String[] args) {
        String[] tipo0 = {"fuego"};
        Pokemon p1 = new Pokemon(4, "Charmander", 100, tipo0);
        p1.setAtaque(15);

        String[] tipo1 = {"planta", "veneno"};
        Pokemon p2 = new Pokemon(1,"Bulbasaur", 100, tipo1, 10, 10, 1);

        //entrenador 1
        Entrenador e1 = new Entrenador(2);


        Ataque arañazo = new Ataque("Arañazo", 10, "normal");
        Ataque placage = new Ataque("placaje", 5, "normal");
        p1.agregarAtaque(arañazo);
        p2.agregarAtaque(placage);

        do {
            if(p1.getVida()<=0){
                break;
            }
            p1.atacar(p2);
            if(p2.getVida()<=0){
                break;
            }
            p2.atacar(p1);
            System.out.println("p2 = " + p2);
            System.out.println("p1 = " + p1);
        }while(true);

        System.out.println("p2 = " + p2);
        System.out.println("p1 = " + p1);
        System.out.println("fin");


    }
}
