import java.util.Date;

public class GestionBibliotheque {
    public static void main(String[] args) throws Exception {
        BiblioTab biblioTab = new BiblioTab();
        BiblioList biblioList = new BiblioList();
        BiblioListPerso biblioListPerso = new BiblioListPerso();
        int cote = 0;

        //Ajout d'ouvrages dans la bibliothèque

            //LIVRES
        Livre unLivre1 = new Livre(cote++,new Date(),"George Orwell", "La ferme des animaux", "GALLIMARD");
        Livre unLivre2 = new Livre(cote++,new Date(),"Paulo Coelho", "L'Alchimiste", "FLAMMARION");
        Livre unLivre3 = new Livre(cote++,new Date(),"Jules Verne", "Vingt mille lieues sous les mers", "GALLIMARD");
        biblioTab.ajoutOuvrage(unLivre1);
        biblioTab.ajoutOuvrage(unLivre2);
        biblioTab.ajoutOuvrage(unLivre3);
        biblioList.ajoutOuvrage(unLivre1);
        biblioList.ajoutOuvrage(unLivre2);
        biblioList.ajoutOuvrage(unLivre3);
        biblioListPerso.ajoutOuvrage(unLivre1);
        biblioListPerso.ajoutOuvrage(unLivre2);
        biblioListPerso.ajoutOuvrage(unLivre3);
        
            //PERIODIQUES
        Periodique unPeriodique1 = new Periodique(cote++,new Date(),"Les idées de la maison", 4, 24);
        Periodique unPeriodique2 = new Periodique(cote++,new Date(),"Les Inrockuptibles", 45, 52);
        Periodique unPeriodique3 = new Periodique(cote++,new Date(),"Le journal du cinéma", 10, 12);
        biblioTab.ajoutOuvrage(unPeriodique1);
        biblioTab.ajoutOuvrage(unPeriodique2);
        biblioTab.ajoutOuvrage(unPeriodique3);
        biblioList.ajoutOuvrage(unPeriodique1);
        biblioList.ajoutOuvrage(unPeriodique2);
        biblioList.ajoutOuvrage(unPeriodique3);
        biblioListPerso.ajoutOuvrage(unPeriodique1);
        biblioListPerso.ajoutOuvrage(unPeriodique2);
        biblioListPerso.ajoutOuvrage(unPeriodique3);

            //CD
        Cd unCD1 = new Cd(cote++,new Date(),"Songs in the Key of Life", "Stevie Wonder");
        Cd unCD2 = new Cd(cote++,new Date(),"Game Theory", "The Roots");
        Cd unCD3 = new Cd(cote++,new Date(),"The Marshall Mathers LP", "Eminem");
        biblioTab.ajoutOuvrage(unCD1);
        biblioTab.ajoutOuvrage(unCD2);
        biblioTab.ajoutOuvrage(unCD3);
        biblioList.ajoutOuvrage(unCD1);
        biblioList.ajoutOuvrage(unCD2);
        biblioList.ajoutOuvrage(unCD3);
        biblioListPerso.ajoutOuvrage(unCD1);
        biblioListPerso.ajoutOuvrage(unCD2);
        biblioListPerso.ajoutOuvrage(unCD3);

        //affichage de la bibliothèque
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("*************************Affichage de la bibliothèque biblioTab*************************");
        biblioTab.afficherBiblio();
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("*************************Affichage de la bibliothèque biblioList*************************");
        biblioList.afficherBiblio();
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("*************************Affichage de la bibliothèque biblioListPerso*************************");
        biblioListPerso.afficherBiblio();
        System.out.println("-------------------------------------------------------------------------------------------------");

        //Suppression d'un ouvrage
        System.out.println("Suppression d'un ouvrage dans la bibliothèque biblioTab");
        biblioTab.suppressionOuvrage(0);
        System.out.println("*************************Affichage de la bibliothèque biblioTab*************************");
        biblioTab.afficherBiblio();
        System.out.println("-------------------------------------------------------------------------------------------------");
        
        System.out.println("Suppression d'un ouvrage dans la bibliothèque biblioList");
        biblioList.suppressionOuvrage(6);
        System.out.println("*************************Affichage de la bibliothèque biblioList*************************");
        biblioList.afficherBiblio();
        System.out.println("-------------------------------------------------------------------------------------------------");
        
        System.out.println("Suppression d'un ouvrage dans la bibliothèque biblioListPerso");
        biblioListPerso.suppressionOuvrage(3);
        System.out.println("*************************Affichage de la bibliothèque biblioListPerso*************************");
        biblioListPerso.afficherBiblio();
        System.out.println("-------------------------------------------------------------------------------------------------");


        //Recherche d'un ouvrage
        System.out.println("Recherche d'un ouvrage dans la bibliothèque biblioTab");
        biblioTab.rechercheOuvrage(4);
        biblioTab.rechercheOuvrage(5);
        System.out.println("Recherche d'un ouvrage dans la bibliothèque biblioList");
        biblioList.rechercheOuvrage(2);
        biblioList.rechercheOuvrage(7);
        System.out.println("Recherche d'un ouvrage dans la bibliothèque biblioListPerso");
        biblioListPerso.rechercheOuvrage(8);
        biblioListPerso.rechercheOuvrage(9);
    }
}

