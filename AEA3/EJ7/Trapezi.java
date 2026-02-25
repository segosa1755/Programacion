package AEA3.EJ7;

public class Trapezi extends Figura {

    private double baseMayor;
    private double baseMenor;
    private double altura;

    public Trapezi() {
    }

    public Trapezi(double baseMayor, double baseMenor, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        calcularArea();
    }

    @Override
    public void calcularArea() {
        area = ((baseMayor + baseMenor) * altura) / 2;
    }
}