package AEA3.EJ7;

import java.util.Scanner;

public class Rombe extends Figura {

    private double diagonalMayor;
    private double diagonalMenor;

    public Rombe() {
    }

    public Rombe(double diagonalMayor, double diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        calcularArea();
    }

    @Override
    public void calcularArea() {
        area = (diagonalMayor * diagonalMenor) / 2;
    }

    @Override
    public void llegirDades() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diagonal major: ");
        diagonalMayor = sc.nextDouble();

        System.out.print("Diagonal menor: ");
        diagonalMenor = sc.nextDouble();
    }
}