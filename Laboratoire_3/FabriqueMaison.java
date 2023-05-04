public class FabriqueMaison {

    private MonteurMaison monteurMaison;

    public void setMonteurMaison(MonteurMaison unMonteurMaison) {
		this.monteurMaison = unMonteurMaison;
    }
    
    public Maison getMaison() {
        return monteurMaison.getMaison();
    }
        
    public void construireMaison() {
        monteurMaison.creerNouvelleMaison();
        monteurMaison.materiau();
        monteurMaison.monterEtage();
        monteurMaison.monterMurs();
        monteurMaison.monterToit();
    }
}
