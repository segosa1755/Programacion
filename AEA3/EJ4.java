import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notes = new double[5];

        for (int i = 0; i < notes.length; i++) {
            System.out.print("Introduce la nota " + (i + 1) + ": ");
            notes[i] = sc.nextDouble();
        }

        System.out.println("Nota mínima: " + notaMinima(notes));
        System.out.println("Nota máxima: " + notaMaxima(notes));
        System.out.println("Nota media: " + notaMitjana(notes));
    }

    public static double notaMinima(double[] notes) {
        double min = notes[0];
        for (int i = 1; i < notes.length; i++) {
            if (notes[i] < min) {
                min = notes[i];
            }
        }
        return min;
    }

    public static double notaMaxima(double[] notes) {
        double max = notes[0];
        for (int i = 1; i < notes.length; i++) {
            if (notes[i] > max) {
                max = notes[i];
            }
        }
        return max;
    }

    public static double notaMitjana(double[] notes) {
        double suma = 0;
        for (int i = 0; i < notes.length; i++) {
            suma += notes[i];
        }
        return suma / notes.length;
    }

}
