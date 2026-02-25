package AEA3.EJ7;

public class Rectangle extends Figura {

    private double base = 5;
    private double altura = 4;

    public Rectangle() {
        calcularArea();
    }

    @Override
    public void calcularArea() {
        area = base * altura;
    }
}