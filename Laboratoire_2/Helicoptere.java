public class Helicoptere extends VehiculeAerien{

    public Helicoptere() {
    }

    @Override
    public int getAltitude() {
        return super.getAltitude();
    }

    @Override
    public void setAltitude(int altitude) {
        super.setAltitude(altitude);
    }

    @Override
    public void afficher() {
        System.out.println("Nom de l'hélicoptère: " + getNom());
        System.out.println("Altitude de l'hélicoptère en pieds: " + getAltitude());
    }

}
