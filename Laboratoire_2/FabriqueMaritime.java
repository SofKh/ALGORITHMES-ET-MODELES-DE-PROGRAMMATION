
public class FabriqueMaritime extends Fabrique {

    public Vehicule creerVehicule(String vehiculeChoisit) {
        if (vehiculeChoisit == "bateau") {
            return new Bateau();
        } else if (vehiculeChoisit == "catamaran") {
            return new Catamaran();
        } else if (vehiculeChoisit == "ferry") {
            return new Ferry();
        }
        return null;
    }
}
