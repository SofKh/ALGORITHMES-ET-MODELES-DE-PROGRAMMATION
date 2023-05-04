import java.util.Date;

public abstract class Ouvrage {
    //paramètres communs à tous les ouvrages
    private Date dateEmprunt;
    private int cote;

    //Constructeurs
    public Ouvrage(int cote,Date dateEmprunt) {
        this.cote = cote;
        this.dateEmprunt = dateEmprunt;
    }

    public Ouvrage() {
    }
    
    //Getters et Setters
    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public int getCote() {
        return cote;
    }

    public void setCote(int cote) {
        this.cote = cote;
    }

    //Méthode toString
    public String toString() {
        return "Ouvrage{ cote= " + cote + "/ dateEmprunt= " + dateEmprunt;
    }
}
