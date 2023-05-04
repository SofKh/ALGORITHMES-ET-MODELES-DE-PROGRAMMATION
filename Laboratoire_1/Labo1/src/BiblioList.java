import java.util.LinkedList;

public class BiblioList implements Bibliotheque{

    //Linkedlist pour stocker les ouvrages
    
    LinkedList<Ouvrage> biblioList = new LinkedList<Ouvrage>();

    @Override
    public void rechercheOuvrage(int uneCote) {
        for (int i = 0; i < biblioList.size(); i++) {
            if (biblioList.get(i).getCote() == uneCote) {
                System.out.println(biblioList.get(uneCote).toString());
                break;
            } else {
                System.out.println("L'ouvrage n'existe pas");
            }
        }
    }

    @Override
    public void ajoutOuvrage(Ouvrage unOuvrage) {
        biblioList.add(unOuvrage);
        System.out.println("L'ouvrage a été ajouté");
    }

    @Override
    public void suppressionOuvrage(int uneCote) {
        for (int i = 0; i < biblioList.size(); i++) {
            if (biblioList.get(i).getCote() == uneCote) {
                biblioList.remove(i);
                System.out.println("L'ouvrage "+uneCote+" a été supprimé");
                break;
            } else {    
                System.out.println("L'ouvrage n'existe pas");
            }
        }
    }

    public void afficherBiblio() {
        for (int i = 0; i < biblioList.size(); i++) {
            if (biblioList.get(i) != null) {
                System.out.println("La bibliothèque contient: "+biblioList.size()+" ouvrages");
                System.out.println("\n"+biblioList.get(i).toString());
            }
        }
    }
    
}
