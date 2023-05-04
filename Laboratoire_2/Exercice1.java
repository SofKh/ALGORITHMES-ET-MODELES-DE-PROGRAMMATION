import java.util.ArrayList;
import java.util.List;

public class Exercice1 {

    private static int compteur = 0;

    public static void hanoi(int n, List<Integer> tourDepart, List<Integer> tourArrivee, List<Integer> tourIntermediaire) {
        if (n == 1) {
            tourArrivee.add(tourDepart.remove(tourDepart.size() - 1));
        } else {
            hanoi(n - 1, tourDepart, tourIntermediaire, tourArrivee);
            tourArrivee.add(tourDepart.remove(tourDepart.size() - 1));
            hanoi(n - 1, tourIntermediaire, tourArrivee, tourDepart);
        }
        compteur++;
    }

    public static void main(String[] args) {
    
        List<Integer> tourDepart = new ArrayList<Integer>();
        List<Integer> tourArrivee = new ArrayList<Integer>();
        List<Integer> tourIntermediaire = new ArrayList<Integer>();

        // Initialisation de la tour de départ avec n disques
        int n = 11;
        for (int i = n; i > 0; i--) {
            tourDepart.add(i);
        }

        // Commencement
        System.out.println("Commencement:");
        System.out.println("Tour De Départ: " + tourDepart);
        System.out.println("Tour D'Arrivée: " + tourArrivee);
        System.out.println("Tour Intermédiaire: " + tourIntermediaire);

        // Exécution de l'algorithme
        hanoi(n, tourDepart, tourArrivee, tourIntermediaire);

        // État final
        System.out.println("État Final:");
        System.out.println("Tour De Départ: " + tourDepart);
        System.out.println("Tour D'Arrivée: " + tourArrivee);
        System.out.println("Tour Intermédiaire: " + tourIntermediaire);
        System.out.println("Nombre de déplacements: " + compteur);
    }
}
// Analyse Asymptotique
// Le nombre d'opérations effectuées par l'algorithme est de 2^n - 1


