package AEA3.Ejercicio6;

public class Developer extends Employee {

    private String lenguajeProgramacion;

    public Developer(String nombre, String direccion, double salario, String lenguajeProgramacion) {
        super(nombre, direccion, salario, "Developer");
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    public double calcularBonus() {
        return salario * 0.10;
    }

    public void escribirCodigo() {
        System.out.println(nombre + " esta escribiendo codigo en " + lenguajeProgramacion + ".");
    }
}
