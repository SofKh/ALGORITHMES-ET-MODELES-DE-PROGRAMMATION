import java.util.Date;

public class Periodique extends Ouvrage {
    //nom, numero, periodicite
    private String nom;
    private int numero;
    private int periodicite; // 12 pour mensuel, 24 pour bi-mensuel, 52 pour hebdomadaire

    //Constructeurs
    public Periodique(int cote, Date dateEmprunt, String nom, int numero, int periodicite) {
        super(cote, dateEmprunt);
        this.nom = nom;
        this.numero = numero;
        this.periodicite = periodicite;
    }
    
    public Periodique() {
    }

    //Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPeriodicite() {
        return periodicite;
    }

    public void setPeriodicite(int periodicite) {
        this.periodicite = periodicite;
    }

    //Méthode toString
    public String toString() {
        return super.toString()+" /Type:Periodique/ " + "Nom= " + nom + " / Numéro= " + numero + "/ Périodicité= " + periodicite + "}";
    }
}