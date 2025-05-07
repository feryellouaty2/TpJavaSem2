import java.util.Scanner;

public class tp3 {

    public static int lectureN(Scanner sc) {
        int n;
        do {
            System.out.println("Donner un entier positif <= 10 :");
            n = sc.nextInt();
        } while (n <= 0 || n > 10);
        return n;
    }

    public static void remplirTab(int[] T, Scanner sc) {
        for (int i = 0; i < T.length; i++) {
            System.out.println("remplir la case T[" + i + "] :");
            T[i] = sc.nextInt();
        }
    }

    public static int[] creeTpaire(int[] T) {
        int count = 0;
        for (int value : T) {
            if (value % 2 == 0) {
                count++;
            }
        }

        int[] T_paire = new int[count];
        int j = 0;
        for (int value : T) {
            if (value % 2 == 0) {
                T_paire[j++] = value;
            }
        }
        return T_paire;
    }

    public static int[] creeTimpaire(int[] T) {
        int count = 0;
        for (int value : T) {
            if (value % 2 != 0) {
                count++;
            }
        }

        int[] T_impaire = new int[count];
        int j = 0;
        for (int value : T) {
            if (value % 2 != 0) {
                T_impaire[j++] = value;
            }
        }
        return T_impaire;
    }

    public static void afficheTab(int[] T, String nom) {
        System.out.println (nom + " :");
        for (int value : T) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = lectureN(sc);
        int[] T = new int[n];
        remplirTab(T, sc);

        int[] T_paire = creeTpaire(T);
        int[] T_impaire = creeTimpaire(T);

        afficheTab(T_paire, "le tableau paire");
        afficheTab(T_impaire, "le tableau impaire");

        sc.close(); 
    }
}
