
public class Catamaran extends VehiculeMaritime{
    public Catamaran(){
    }

    @Override
    public int getVitesse() {
        return super.getVitesse();
    }

    @Override
    public void setVitesse(int vitesse) {
        super.setVitesse(vitesse);
    }

    @Override
    public int getNombrePassagers() {
        return super.getNombrePassagers();
    }

    @Override
    public void setNombrePassagers(int nombrePassagers) {
        super.setNombrePassagers(nombrePassagers);
    }

    @Override
    public void afficher() {
        System.out.println("Nom du catamaran: " + getNom());
        System.out.println("Vitesse du catamaran en noeuds: " + getVitesse());
        System.out.println("Nombre de passagers: " + getNombrePassagers());
    }
}
