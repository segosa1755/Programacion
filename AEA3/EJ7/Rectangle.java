package AEA3.EJ7;

import java.util.Scanner;

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

    @Override
    public void llegirDades() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix base: ");
        base = sc.nextDouble();

        System.out.print("Introdueix altura: ");
        altura = sc.nextDouble();
    }
}