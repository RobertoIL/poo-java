package ejemplo2;

public class Main {
    public static void main(String[] args) {

        Alumno a0 = new Alumno("Nicolas", "12345678921");
        Profesor p0 = new Profesor("Armin", 200000);
        Asignatura asignatura = new Asignatura("Programacion", 30, p0);
        Colegio colegio = new Colegio("UFRO");


    }
}
