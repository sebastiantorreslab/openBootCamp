package IntroInformatica.ejercicioTema4;

public class Numeros {


    public void compararNumeros(int a){
        if(a > 0){
            System.out.println("El numero " + a + " es positivo");
        }else if (a < 0){
            System.out.println("El numero " + a + " es negativo");
        }else{
            System.out.println("El número es igual a cero");
        }

    }

    public int numeroWhile = 0;

    public void bucleWhile(){
        while (numeroWhile < 3){
            System.out.println("Numero: " + numeroWhile);
            numeroWhile++;
        }

    }

    public void doWhile(){
        do{
            System.out.println("El número es: " + numeroWhile);
        } while(numeroWhile > 4);

    }

;

    public void bucleFor(){
        for(int numeroFor = 0; numeroFor <= 3;numeroFor++){
            System.out.println("Numero for: " + numeroFor);
        }
    }



    public void estaciones(String estacion){
        switch (estacion){
            case "VERANO":
                System.out.println("La estación es verano");
                break;
            case "INVIERNO":
                System.out.println("La estación es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("La estación es primavera");
                break;
            case "OTOÑO":
                System.out.println("La estación es otoño");
                break;
            default:
                System.out.println("Valor desconocido");
                break;


        }
    }


}
