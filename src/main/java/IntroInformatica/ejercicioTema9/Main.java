package IntroInformatica.ejercicioTema9;

public class Main {
    public static void main(String[] args) {

        Persona cliente = new Cliente("Silvio Dante",45,1234L,5000);
        System.out.println(cliente);

        Persona trabajador = new Trabajador("Furio",35,12345L,4500);
        System.out.println(trabajador);


    }
}
