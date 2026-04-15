package AEA4.ej2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class InvertirParaules {
    public static void main(String[] args) {
        File inputFile = new File("arxiu.txt");
        File outputFile = new File("arxiu_invertit.txt");

        // Uso de try-with-resources para asegurar el cierre de flujos
        try (Scanner lector = new Scanner(inputFile);
             PrintWriter escritor = new PrintWriter(outputFile)) {

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                // Invertir cadena
                String invertida = new StringBuilder(linea).reverse().toString();
                escritor.println(invertida);
            }
            System.out.println("Programa finalitzat correctament.");

        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: no s'ha trobat l'arxiu.txt");
        } catch (Exception e) {
            System.out.println("Error inesperat: " + e.getMessage());
        }
    }
}