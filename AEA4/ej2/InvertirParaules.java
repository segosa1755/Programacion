import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;

public class InvertirParaules {
    public static void main(String[] args) {
        File inputFile = new File("arxiu.txt");
        File outputFile = new File("arxiu_invertit.txt");

        Scanner lector = null;
        PrintWriter escritor = null;

        try {
            lector = new Scanner(inputFile);
            escritor = new PrintWriter(outputFile);

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                String invertida = new StringBuilder(linea).reverse().toString();
                escritor.println(invertida);
            }

        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: no s'ha trobat l'arxiu.txt");
        } catch (Exception e) {
            System.out.println("Error inesperat: " + e.getMessage());
        } finally {
            if (lector != null) {
                lector.close();
            }
            if (escritor != null) {
                escritor.close();
            }
            System.out.println("Programa finalitzat");
        }
    }
}