package AEA3.EJ7;

public class Parallelogram extends Figura {

    private double base;
    private double altura;

    public Parallelogram() {
    }

    public Parallelogram(double base, double altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
    }

    @Override
    public void calcularArea() {
        area = base * altura;
    }
}
