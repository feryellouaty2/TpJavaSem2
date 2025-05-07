import java.util.Scanner;

public class tp4 {
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Donner un entier positif :");
            n = sc.nextInt();
        } while (n > 10);
        return n;
    }

    public static void remplirTab(float[][] M, Scanner sc, int nl, int nc) {
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.printf("remplire la case num[" + i + "]" + "[" + j + "]");
                M[i][j] = sc.nextFloat();
            }
        }
    }

    public static float CalculSomme(float[][] M, int nl, int nc, int i) {
        float somme = 0;
        for (int j = 0; j < nc; j++) {
            somme += M[i][j];

        }
        return somme;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Création d’un tableau ");

        int nl = lectureN();
        int nc = lectureN();

        float[][] M = new float[nl][nc];

        System.out.println("Remplissage de la matrice ");
        remplirTab(M, sc, nl, nc);

        for (int i = 0; i < nl; i++) {
            float somme = CalculSomme(M, nl, nc, i);
            System.out.print("Somme de la ligne" + " " + i + somme + "\n");

        }

        sc.close();
    }
}