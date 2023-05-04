public class Avion extends VehiculeAerien {

    public Avion() {
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
        System.out.println("Nom de l'avion: " + getNom());
        System.out.println("Altitude de l'avion en pieds: " + getAltitude());
    }
}
