package ejercicio6;

public class Titular {
    private String nombre;
    private int edad;
    private int rut;
    private char sexo = 'H';
    private float peso;
    private float estatura;

    //contructor por defecto
    public Titular(String nombre, int edad, float peso, float estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }

    //contructor
    public Titular(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Titular() {

    }

    //metodo para imc
    public float calcularImc(){
        float imc = (peso/(estatura*estatura));
        if(imc<20){
            return -1;
        }
        if (imc>=20 && imc<=25){
            return imc=0;
        }
        else{
            return imc=1;
        }
    }
    //metodo para ver si la persona es mayor de edad o no
    public boolean esMayor(){
        boolean mayor;
        if(edad>=18){
            return mayor=true;
        }
        else{
            return mayor=false;
        }
    }

    //metodos set para cada parametro
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    //metodo para comprobar sexo
    private void comprobarSexo(char sexo){
        if(sexo!='H' && sexo!='M'){
            sexo = 'H';
        }else {
            this.sexo = sexo;
        }
    }

    //metodo para generar rut


    @Override
    public String toString() {
        return "persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", rut=" + rut +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", estatura=" + estatura +
                '}';
    }
}
