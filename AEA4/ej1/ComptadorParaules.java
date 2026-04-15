import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class ComptadorParaules {
    public static void main(String[] args) {
        // Definició de fitxers segons l'enunciat [cite: 11, 15]
        String fitxerEntrada = "entrada.txt";
        String fitxerSortida = "sortida.txt";

        BufferedReader br = null;
        BufferedWriter bw = null;
        int contador = 0;

        try {
            // 1. Lectura del fitxer d'entrada [cite: 10]
            br = new BufferedReader(new FileReader(fitxerEntrada));
            String linia;

            while ((linia = br.readLine()) != null) {
                // Comptatge per espais en blanc [cite: 12]
                if (!linia.trim().isEmpty()) {
                    String[] paraules = linia.trim().split("\\s+");
                    contador += paraules.length;
                }
            }

            // 2. Escriptura del fitxer de sortida [cite: 14]
            // FileWriter per defecte sobreescriu [cite: 19]
            bw = new BufferedWriter(new FileWriter(fitxerSortida));
            bw.write("El archivo tiene " + contador + " palabras.");

            System.out.println("Procés completat correctament.");

        } catch (FileNotFoundException e) {
            // Requisit: missatge si el fitxer no existeix [cite: 18]
            System.out.println("Error: El fitxer '" + fitxerEntrada + "' no s'ha trobat.");
        } catch (IOException e) {
            // Gestió d'altres excepcions d'E/S [cite: 13, 16]
            System.out.println("S'ha produït un error de lectura/escriptura: " + e.getMessage());
        } finally {
            // Requisit: tancament correcte dels fluxos [cite: 21]
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
