import java.util.Scanner;
public class Repaso1 {
    public static void main(String[] args) {

        Scanner s;
        s = new Scanner(System.in);
        double[] temp;
        temp = new double[7];
        double suma;
        suma = 0;
        double max;
        double min;
        int diaMax;
        int diaMin;
        int i;
        for (i = 0; i < 7; i++) {
            System.out.print("Introduce la temperatura del día " + (i + 1) + ": ");
            temp[i] = s.nextDouble();
            suma = suma + temp[i];

            if (i == 0) {
                max = temp[0];
                min = temp[0];
                diaMax = 1;
                diaMin = 1;
            } else {
                if (temp[i] > max) {
                    max = temp[i];
                    diaMax = i + 1;
                }
                if (temp[i] < min) {
                    min = temp[i];
                    diaMin = i + 1;
                }
            }
        }

        double media;
        media = suma / 7;
        System.out.println("Temperatura media: " + media);
        System.out.println("Temperatura máxima: " + max + " (día " + diaMax + ")");
        System.out.println("Temperatura mínima: " + min + " (día " + diaMin + ")");
    }
}
