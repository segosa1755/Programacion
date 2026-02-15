package AEA3.Ejercicio6;

public class Programmer extends Employee {

    public Programmer(String nombre, String direccion, double salario) {
        super(nombre, direccion, salario, "Programmer");
    }

    @Override
    public double calcularBonus() {
        return salario * 0.12;
    }

    public void debug() {
        System.out.println(nombre + " esta haciendo debug del codigo.");
    }
}
