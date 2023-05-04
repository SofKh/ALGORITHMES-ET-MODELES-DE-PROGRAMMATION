public class ClientMaison {
    public static void main(String[] args) {

        FabriqueMaison uneFabrique = new FabriqueMaison();
	
	    MonteurBois unMonteurBois = new MonteurBois();
	    MonteurBeton unMonteurBeton = new MonteurBeton();

        Maison nouvelleMaison;

		uneFabrique.setMonteurMaison(unMonteurBois); // la Fabrique va recevoir le MonteurMaison 
                                                     // selon le matériau choisit par le client
                                                     // MonteurBois ou MonteurBeton
		uneFabrique.construireMaison();     // construction de la Maison
		nouvelleMaison = uneFabrique.getMaison();  // nouvelle maison construite            
		System.out.println(nouvelleMaison.getRepresentation()); //Affichage des propriétés de la maison
		
		uneFabrique.setMonteurMaison(unMonteurBois);
		uneFabrique.construireMaison();
		nouvelleMaison = uneFabrique.getMaison();
		System.out.println(nouvelleMaison.getRepresentation());
	}
}
