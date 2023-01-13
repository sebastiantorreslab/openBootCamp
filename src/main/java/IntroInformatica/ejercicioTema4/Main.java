package IntroInformatica.ejercicioTema4;

public class Main {
    public static void main(String[] args) {

        Numeros numeros = new Numeros();

        numeros.compararNumeros(5);
        numeros.compararNumeros(0);
        numeros.compararNumeros(-1);

        System.out.println("\n--------------------\n");

        numeros.bucleWhile();

        System.out.println("\n--------------------\n");

        numeros.bucleFor();

        System.out.println("\n--------------------\n");

        numeros.estaciones("VERANO");

        System.out.println("\n--------------------\n");

    }
}
