public abstract class VehiculeTerrestre extends Vehicule{

    public void afficher(){
    }

    int puissance;
    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    String couleur;
    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
