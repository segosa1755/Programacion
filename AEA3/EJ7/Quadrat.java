package AEA3.EJ7;

public class Quadrat extends Figura {

    private double lado;

    public Quadrat() {
    }

    public Quadrat(double lado) {
        this.lado = lado;
        calcularArea();
    }

    @Override
    public void calcularArea() {
        area = lado * lado;
    }
}