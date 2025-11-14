import java.util.Scanner;

public class ValorsMatrius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("¿Cuántas filas tendrá la matriz? ");
        int files = s.nextInt();
        System.out.print("¿Cuántas columnas tendrá la matriz? ");
        int columnes = s.nextInt();
        int[][] matriu = new int[files][columnes];
        System.out.println("Introduce los valores de la matriz:");
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                System.out.print("Valor en [" + i + "][" + j + "]: ");
                matriu[i][j] = s.nextInt();
            }
        }
        System.out.println("Matriz transformada:");
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {

                if (i % 2 == 0 && j % 2 == 0) { 
                    matriu[i][j] = 1;
                } else if (i % 2 == 0 && j % 2 != 0) {
                    matriu[i][j] = 2;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    matriu[i][j] = 3;
                } else {
                    matriu[i][j] = 4;
                }
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }
    }
}
