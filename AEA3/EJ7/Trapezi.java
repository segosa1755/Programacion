package AEA3.EJ7;

import java.util.Scanner;

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

    @Override
    public void llegirDades() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base major: ");
        baseMayor = sc.nextDouble();

        System.out.print("Base menor: ");
        baseMenor = sc.nextDouble();

        System.out.print("Altura: ");
        altura = sc.nextDouble();
    }
}