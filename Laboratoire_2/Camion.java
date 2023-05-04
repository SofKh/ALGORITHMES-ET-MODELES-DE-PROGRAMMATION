public class Camion extends VehiculeTerrestre {
    public Camion() {
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
        System.out.println("Nom du camion: " + getNom());
        System.out.println("Couleur du camion: " + getCouleur());
        System.out.println("Puissance du camion en chevaux: " + getPuissance());
    }

}
