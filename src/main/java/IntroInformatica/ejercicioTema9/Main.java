package IntroInformatica.ejercicioTema9;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Silvio Dante",45,1234L,5000);
        System.out.println(cliente);

        Trabajador trabajador = new Trabajador("Furio",35,12345L,4500);
        System.out.println(trabajador);


    }
}
