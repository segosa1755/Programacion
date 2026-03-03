package AEA3.EJ7;

import java.util.Scanner;

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

    @Override
    public void llegirDades() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        base = sc.nextDouble();

        System.out.print("Altura: ");
        altura = sc.nextDouble();
    }
}
