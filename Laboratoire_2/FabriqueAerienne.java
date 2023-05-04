
public class FabriqueAerienne extends Fabrique {

    public Vehicule creerVehicule(String vehiculeChoisit) {
        if (vehiculeChoisit == "avion") {
            return new Avion();
        } else if (vehiculeChoisit == "helicoptere") {
            return new Helicoptere();
        }
        return null;
    }
}

