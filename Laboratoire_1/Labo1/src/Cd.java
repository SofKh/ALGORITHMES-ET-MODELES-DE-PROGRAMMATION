import java.util.Date;

public class Cd extends Ouvrage{
    //titre, auteur
    private String titre;
    private String auteur;

    //Constructeurs
    public Cd(int cote, Date dateEmprunt,String titre, String auteur) {
        super(cote, dateEmprunt);
        this.titre = titre;
        this.auteur = auteur;
    }
        
    public Cd() {
    }

    //Getters et Setters
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    //Méthode toString
    public String toString() {
        return super.toString()+" /Type:Cd/ " + "Titre= " + titre + "/ Auteur= " + auteur + "}";
    }
}