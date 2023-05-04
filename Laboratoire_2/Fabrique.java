public abstract class Fabrique {
    
    public static Fabrique getFabrique(String typeVehicule) {
        if (typeVehicule == "terrestre") {
            return new FabriqueTerrestre();
        } else if (typeVehicule == "aerien") {
            return new FabriqueAerienne();
        } else if (typeVehicule == "maritime") {
            return new FabriqueMaritime();
        }
        return null;
    }

    public abstract Vehicule creerVehicule(String vehiculeChoisit);
}