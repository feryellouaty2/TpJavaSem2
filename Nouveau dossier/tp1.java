import java.util.Scanner;
public class tp1 {
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Donner un entier positif :");
            n = sc.nextInt();
        } while (n < 0);
        return n;
    }

    public static void remplirTab(int[] T, Scanner sc) {

        for (int i = 0; i < T.length; i++) {
            System.out.println("remplir le case T[" + i + "]");
            T[i] = sc.nextInt();
        }
    }

    public static void remplacer(int[] T, int X1, int X2) {
        for (int i = 0; i < T.length; i++) {
            if (T[i] == X1) {
                T[i] = X2;
            }
        }
    }

    public static void afficheTab(int[] T) {
        for (int i = 0; i < T.length; i++) {
            System.out.println(T[i] + "");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = lectureN();
        int[] T = new int[n];
        remplirTab(T, sc);
        System.out.println("donner X1");
        int X1 = sc.nextInt();
        System.out.println("donner X2");
        int X2 = sc.nextInt();
        remplacer(T, X1, X2);
        afficheTab(T);
        sc.close();

    }
}
