package AEA3.EJ8;

public abstract class Allotjament {

    protected String nom;
    protected int capacitat;
    protected boolean disponible;

    public Allotjament(String nom, int capacitat) {
        this.nom = nom;
        this.capacitat = capacitat;
        this.disponible = true;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public boolean reservar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }

    public void alliberar() {
        disponible = true;
    }

    public abstract double calcularPreuPerNit();

    public abstract String mostrarInformacio();
}