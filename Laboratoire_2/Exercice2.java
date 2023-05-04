public class Exercice2 {
    //algorithme de tri de façon récursive

    public static void tri(int[] tab, int n) {
        if (n <= 1) {
            return;
        }
        tri(tab, n - 1);
        int dernier = tab[n - 1];
        int j = n - 2;
        while (j >= 0 && tab[j] > dernier) {
            tab[j + 1] = tab[j];
            j--;
        }
        tab[j + 1] = dernier;
    }


    public static void main(String[] args) {
        int[] tab = {-35, 0, 46, 13, 2, 100};
        tri(tab, tab.length);
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
