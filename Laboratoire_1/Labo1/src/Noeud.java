public class Noeud {
    Ouvrage unOuvrage;
    Noeud suiv;
    Noeud prec;

    Noeud(){
        this.unOuvrage = null;
        this.suiv = null;
        this.prec = null;
    }
    Noeud(Ouvrage unOuvrage) {
        this.unOuvrage = unOuvrage;
        this.suiv = null;
        this.prec = null;
    }
}
