public interface ListeChainee {
    boolean ajoutOuvrage(Ouvrage unOuvrage);
    boolean suppressionOuvrage(int cote);
    Noeud rechercheOuvrage(int cote);   
}
