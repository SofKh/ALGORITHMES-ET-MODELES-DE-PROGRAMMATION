public interface Bibliotheque {     //interface Bibliotheque dans laquelle on déclare les méthodes abstraites
    void ajoutOuvrage(Ouvrage unOuvrage);
    void suppressionOuvrage(int cote);
    void rechercheOuvrage(int cote);
    }
