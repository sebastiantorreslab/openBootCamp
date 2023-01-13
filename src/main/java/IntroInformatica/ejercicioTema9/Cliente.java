package IntroInformatica.ejercicioTema9;

public class Cliente extends Persona{

    private double credito;

    public Cliente(String nombre, int edad, Long telefono, double credito) {
        super(nombre, edad, telefono);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "credito=" + credito +
                '}';
    }
}
