import java.util.Date;

public class Livre extends Ouvrage {
// propriétés : auteur, titre, éditeur
    private String auteur;
    private String titre;
    private String editeur;
    
    //Constructeurs
    public Livre(int cote, Date dateEmprunt, String auteur, String titre, String editeur) {
        super(cote, dateEmprunt);
        this.auteur = auteur;
        this.titre = titre;
        this.editeur = editeur;
    }

    public Livre() {
    }

    //Getters et Setters
    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    //Méthode toString
    public String toString() {
        return super.toString()+" /Type:Livre/ " + "Auteur= " + auteur + "/ Titre= " + titre + "/ Editeur= " + editeur +"}";
    }
}
