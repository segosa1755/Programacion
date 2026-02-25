package AEA3.EJ7;

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
}