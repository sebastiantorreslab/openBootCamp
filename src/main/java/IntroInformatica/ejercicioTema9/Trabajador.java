package IntroInformatica.ejercicioTema9;

public class Trabajador extends Persona{

    private double salario;

    public Trabajador(String nombre, int edad, Long telefono, double salario) {
        super(nombre, edad, telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "salario=" + salario +
                '}';
    }
}
