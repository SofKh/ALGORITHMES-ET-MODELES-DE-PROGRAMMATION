public class ListeChaineePerso implements ListeChainee {
    Noeud tete;
    Noeud queue;
    int taille;

    ListeChaineePerso() {
        this.tete = null;
        this.queue = null;
        this.taille = 0;
    }

    @Override
    public boolean ajoutOuvrage(Ouvrage unOuvrage) {
        Noeud unNoeud = new Noeud(unOuvrage);
        if (this.tete == null) { //Liste vide
            this.tete = unNoeud;
            this.queue = unNoeud;
        } else {
            this.queue.suiv = unNoeud;
            unNoeud.prec = this.queue;
            this.queue = unNoeud;
        }
        this.taille++;
        return true;
    }

    @Override
    public Noeud rechercheOuvrage(int uneCote) {
        Noeud pt = this.tete;
        while(pt != null){
            if(pt.unOuvrage.getCote() == uneCote){
                return pt;// Pour sortir de la boucle
            }else {
                pt = pt.suiv;
            }
        }
        return pt;
    }

    @Override
    public boolean suppressionOuvrage(int cote) {
        Noeud posObj = rechercheOuvrage(cote);
       
        if(posObj == null){
            System.out.println("Objet introuvable");
        } else if(posObj == this.tete){// Cas si on supprime le premier noeud
            this.tete = this.tete.suiv;
        }else if(posObj == this.queue){// Cas où on supprime le dernier noeud
            posObj.prec.suiv = posObj.suiv;
        }else {// Cas où on supprime un élément autre que le premier ou dernier noeud
            posObj.prec.suiv = posObj.suiv;
            posObj.suiv.prec = posObj.prec;
        }
        this.taille--;
        return true;
    }

    @Override
        public String toString() {
        Noeud pt = this.tete;
        while(pt != null){
            System.out.println("La bibliothèque contient: "+taille+" ouvrages");
            System.out.println("\n"+pt.unOuvrage.toString());
            pt = pt.suiv;
        }
        return "";
    }
}
