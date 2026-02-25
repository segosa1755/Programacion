package AEA3.EJ7;

public class Cercle extends Figura {

    private double radio;

    public Cercle() {
    }

    public Cercle(double radio) {
        this.radio = radio;
        calcularArea();
    }

    @Override
    public void calcularArea() {
        area = Math.PI * radio * radio;
    }
}