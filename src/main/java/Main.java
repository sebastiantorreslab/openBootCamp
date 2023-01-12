public class Main {
    public static void main(String[] args) {

        Funcion funcion = new Funcion();
        System.out.println(funcion.suma(10,10,15));

        Coche coche = new Coche();
        coche.aumentarPuertas();
        coche.aumentarPuertas();
        coche.aumentarPuertas();
        System.out.println(coche.numeroPuertas);



    }
}
