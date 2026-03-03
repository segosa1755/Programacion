package AEA3.EJ7;

import java.util.Scanner;

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

    @Override
    public void llegirDades() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix radi: ");
        radio = sc.nextDouble();
    }
}