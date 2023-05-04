
public class BiblioTab implements Bibliotheque {

    public final int TAILLE_MAX = 20;
    int cote = 0;

    //tableau pour stocker les ouvrages
    Ouvrage biblioTab[] = new Ouvrage[TAILLE_MAX];

    
    //recherche d'un ouvrage par sa cote
    @Override
    public void rechercheOuvrage(int uneCote) {
        for (int i = 0; i < cote; i++) {
            if (biblioTab[i].getCote() == uneCote) {
                System.out.println(biblioTab[i].toString());
                break;
            } else {
                System.out.println("L'ouvrage n'existe pas");
            }
        }
    }
    @Override
    public void ajoutOuvrage(Ouvrage unOuvrage) {
            if (cote < TAILLE_MAX) {
                biblioTab[cote++] = unOuvrage;
                System.out.println("L'ouvrage a été ajouté");
            } else {
                System.out.println("La bibliothèque est pleine");
            }
    }

    @Override
    public void suppressionOuvrage(int uneCote) {
        for (int i = 0; i < biblioTab.length; i++) {
            if (biblioTab[i].getCote() == uneCote) {
                biblioTab[i] = null;
                cote--;
                System.out.println("L'ouvrage "+uneCote+" a été supprimé");
                break;
            } else {
                System.out.println("L'ouvrage n'existe pas");
            }
        }
    }

    public void afficherBiblio() {
        for (int i = 0; i < biblioTab.length; i++) {
            if (biblioTab[i] != null) {
                System.out.println("La bibliothèque contient: "+cote+" ouvrages");
                System.out.println("\n"+biblioTab[i].toString());
            }
        }
    }
}