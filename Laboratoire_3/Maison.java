public class Maison implements IEtage, IMurs, IToit{

    protected String materiau;
    protected String etage;
    protected String murs;
    protected String toit;

    public void setMateriau(String materiau){
        this.materiau = materiau;
    }
    public void setEtage(String etage){
        this.etage = etage;
    }
    public void setMurs(String murs){
        this.murs = murs;
    }
    public void setToit(String toit){
        this.toit = toit;
    }

    public String getEtageRepresentation(){
        return "Construction de " +this.etage+ " terminée\n";
    }

	public String getMursRepresentation() {
		return "Construction de "+this.murs+" terminée\n";
	}
	
	public String getToitRepresentation() {
		return "Construction de "+this.toit+" terminée\n";
	}
	
	public String getRepresentation() {
		String message = "Construction d'une maison en "+this.materiau+"\n";
		message += this.getEtageRepresentation();
		message += this.getMursRepresentation();
		message += this.getToitRepresentation();
		return message;
	}
}
