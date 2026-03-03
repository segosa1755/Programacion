package AEA3.EJ7;

import java.util.Scanner;

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

    @Override
    public void llegirDades() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix base: ");
        base = sc.nextDouble();

        System.out.print("Introdueix altura: ");
        altura = sc.nextDouble();
    }
}