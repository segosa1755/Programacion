import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ComptadorParaules {
    public static void main(String[] args) {
        File inputFile = new File("entrada.txt");
        File outputFile = new File("sortida.txt");

        Scanner lector = null;
        PrintWriter escritor = null;

        int contador = 0;

        try {
            lector = new Scanner(inputFile);

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                if (!linea.trim().isEmpty()) {
                    String[] palabras = linea.trim().split("\\s+");
                    contador += palabras.length;
                }
            }

            escritor = new PrintWriter(outputFile);
            escritor.println("Nombre total de paraules: " + contador);

        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: no s'ha trobat entrada.txt");
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