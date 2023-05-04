public abstract class MonteurMaison {
    protected Maison maison;

    public Maison getMaison(){
        return maison;
    }

    public void creerNouvelleMaison(){
        maison = new Maison();
    }

    public abstract void materiau();
    public abstract void monterEtage();
    public abstract void monterMurs();
    public abstract void monterToit();
}
