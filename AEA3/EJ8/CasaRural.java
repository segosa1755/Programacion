package AEA3.EJ8;

public class CasaRural extends Allotjament {

    private boolean teJardi;
    private boolean tePiscina;

    public CasaRural(String nom, int capacitat, boolean teJardi, boolean tePiscina) {
        super(nom, capacitat);
        this.teJardi = teJardi;
        this.tePiscina = tePiscina;
    }

    public boolean isTeJardi() {
        return teJardi;
    }

    public void setTeJardi(boolean teJardi) {
        this.teJardi = teJardi;
    }

    public boolean isTePiscina() {
        return tePiscina;
    }

    public void setTePiscina(boolean tePiscina) {
        this.tePiscina = tePiscina;
    }

    @Override
    public double calcularPreuPerNit() {

        double preu = 150;

        if (tePiscina) {
            preu += 50;
        }

        return preu;
    }

    @Override
    public String mostrarInformacio() {
        return "Casa Rural - " + nom +
                " | Jardi: " + teJardi +
                " | Piscina: " + tePiscina +
                " | Preu: " + calcularPreuPerNit() +
                " | Disponible: " + disponible;
    }
}