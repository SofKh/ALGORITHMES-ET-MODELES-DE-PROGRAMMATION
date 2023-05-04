
public class FabriqueTerrestre extends Fabrique {
    
        public Vehicule creerVehicule(String vehiculeChoisit) {
            if (vehiculeChoisit == "voiture") {
                return new Voiture();
            } else if (vehiculeChoisit == "camion") {
                return new Camion();
            } else if (vehiculeChoisit == "moto") {
                return new Moto();
            }
            return null;
        }
}
