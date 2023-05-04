public class Exercice3 {
    public static void main(String[] args) {

        Fabrique FabricationVehiculeTerrestre = Fabrique.getFabrique("terrestre");
        VehiculeTerrestre vehiculeTerrestre = (VehiculeTerrestre) FabricationVehiculeTerrestre.creerVehicule("camion");
        vehiculeTerrestre.setNom("GMC");
        vehiculeTerrestre.setCouleur("Bleu");
        vehiculeTerrestre.setPuissance(400);
        vehiculeTerrestre.afficher();

        System.out.println("--------------------------------------------");

        Fabrique FabricationVehiculeAerien = Fabrique.getFabrique("aerien");
        VehiculeAerien vehiculeAerien = (VehiculeAerien) FabricationVehiculeAerien.creerVehicule("avion");
        vehiculeAerien.setNom("Airbus");
        vehiculeAerien.setAltitude(25000);
        vehiculeAerien.afficher();

        System.out.println("--------------------------------------------");

        Fabrique FabricationVehiculeMaritime = Fabrique.getFabrique("maritime");
        VehiculeMaritime vehiculeMaritime = (VehiculeMaritime) FabricationVehiculeMaritime.creerVehicule("bateau");
        vehiculeMaritime.setNom("Titanic");
        vehiculeMaritime.setVitesse(22);
        vehiculeMaritime.setNombrePassagers(3500);
        vehiculeMaritime.afficher();

        System.out.println("--------------------------------------------");

        Fabrique UneFabricationVehiculeMaritime = Fabrique.getFabrique("maritime");
        VehiculeMaritime UnvehiculeMaritime = (VehiculeMaritime) UneFabricationVehiculeMaritime.creerVehicule("catamaran");
        UnvehiculeMaritime.setNom("Speedy2000");
        UnvehiculeMaritime.setVitesse(8);
        UnvehiculeMaritime.setNombrePassagers(28);
        UnvehiculeMaritime.afficher();

    }
}
