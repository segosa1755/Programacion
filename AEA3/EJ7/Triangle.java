package AEA3.EJ7;

public class Triangle extends Figura {

    private double base;
    private double altura;

    public Triangle() {
    }

    public Triangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
    }

    @Override
    public void calcularArea() {
        area = (base * altura) / 2;
    }
}