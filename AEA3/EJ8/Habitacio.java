package AEA3.EJ8;

public class Habitacio extends Allotjament {

    private int numLlits;

    public Habitacio(String nom, int capacitat, int numLlits) {
        super(nom, capacitat);
        this.numLlits = numLlits;
    }

    public int getNumLlits() {
        return numLlits;
    }

    public void setNumLlits(int numLlits) {
        this.numLlits = numLlits;
    }

    @Override
    public double calcularPreuPerNit() {

        double preu = 50;

        if (numLlits > 2) {
            preu += (numLlits - 2) * 20;
        }

        return preu;
    }

    @Override
    public String mostrarInformacio() {
        return "Habitacio - " + nom +
                " | Llits: " + numLlits +
                " | Preu: " + calcularPreuPerNit() +
                " | Disponible: " + disponible;
    }
}