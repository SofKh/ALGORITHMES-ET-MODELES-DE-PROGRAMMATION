public class Voiture extends VehiculeTerrestre{
    public Voiture(){
    }

    @Override
    public int getPuissance() {
        return super.getPuissance();
    }

    @Override
    public void setPuissance(int puissance) {
        super.setPuissance(puissance);
    }

    @Override
    public String getCouleur() {
        return super.getCouleur();
    }

    @Override
    public void setCouleur(String couleur) {
        super.setCouleur(couleur);
    }

    @Override
    public void afficher() {
        System.out.println("Nom de la voiture: " + getNom());
        System.out.println("Couleur de la voiture: " + getCouleur());
        System.out.println("Puissance de la voiture en chevaux: " + getPuissance());
    }
}
