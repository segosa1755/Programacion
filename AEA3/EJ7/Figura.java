package AEA3.EJ7;

public abstract class Figura {

    protected double area;

    public Figura() {
    }

    public abstract void calcularArea();

    public double getArea() {
        return area;
    }

    public void mostrarArea() {
        System.out.println("Area: " + area);
    }
}