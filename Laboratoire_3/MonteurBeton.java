public class MonteurBeton extends MonteurMaison {

	public void materiau() {
		maison.setMateriau("béton");
	}
    
	public void monterEtage() {
		maison.setEtage("étage en béton");
	}

	public void monterMurs() {
		maison.setMurs("murs en béton");
	}

	public void monterToit() {
		maison.setToit("toit en béton");	
	}

}
