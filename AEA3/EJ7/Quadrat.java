package AEA3.EJ7;

import java.util.Scanner;

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

    @Override
    public void llegirDades() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix costat: ");
        lado = sc.nextDouble();
    }
}