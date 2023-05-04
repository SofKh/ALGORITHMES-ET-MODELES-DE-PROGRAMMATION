public class BiblioListPerso implements Bibliotheque{

    ListeChaineePerso biblioListPerso = new ListeChaineePerso();

    @Override
    public void ajoutOuvrage(Ouvrage unOuvrage) {
        if (biblioListPerso.ajoutOuvrage(unOuvrage)) {
            System.out.println("L'ouvrage a été ajouté");
        } else {
            System.out.println("L'ouvrage n'a pas été ajouté");
        }
    }

    @Override
    public void suppressionOuvrage(int uneCote) {
        if (biblioListPerso.suppressionOuvrage(uneCote)) {
            System.out.println("L'ouvrage "+uneCote+ " a été supprimé");
        } else {
            System.out.println("L'ouvrage n'existe pas");
        }
    }

    @Override
    public void rechercheOuvrage(int uneCote) {
        Noeud pt = biblioListPerso.rechercheOuvrage(uneCote);
        if (pt != null) {
            System.out.println(pt.unOuvrage.toString());
        } else {
            System.out.println("L'ouvrage n'existe pas");
        }
    }

    public void afficherBiblio() {
        biblioListPerso.toString();
    }
}
