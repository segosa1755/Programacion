import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class ComptadorParaules {
    public static void main(String[] args) {
        String fitxerEntrada = "entrada.txt";
        String fitxerSortida = "sortida.txt";

        BufferedReader br = null;
        BufferedWriter bw = null;
        int contador = 0;
        try {
            br = new BufferedReader(new FileReader(fitxerEntrada));
            String linia;

            while ((linia = br.readLine()) != null) {
                if (!linia.trim().isEmpty()) {
                    String[] paraules = linia.trim().split("\\s+");
                    contador += paraules.length;
                }
            }
            bw = new BufferedWriter(new FileWriter(fitxerSortida));
            bw.write("El archivo tiene " + contador + " palabras.");

            System.out.println("Procés completat correctament.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: El fitxer '" + fitxerEntrada + "' no s'ha trobat.");
        } catch (IOException e) {
            System.out.println("S'ha produït un error de lectura/escriptura: " + e.getMessage());
        } finally {
            try {
                if (br != null)
                    br.close();
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                System.out.println("Error en tancar els fitxers.");
            }
        }
    }
}
