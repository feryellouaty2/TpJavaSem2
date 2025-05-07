import java.util.Scanner;

public class exercice {
    public static double somme(double[] T) {
        double s = 0;

        for (int i = 0; i < T.length; i++) {
            s += T[i];
        }
        return s;
    }

    public static void incre(double[] T, double pr) {
        for (int i = 0; i < T.length; i++) {
            T[i] = T[i] + pr;
        }
    }

    public static void afficheTab(double[] T) {
        for (int i = 0; i < T.length; i++) {
            System.out.print(T[i] + ",");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] T = { 14.5, 15, 12 };
        System.out.print("le tableau est :");
        afficheTab(T);
        System.out.println("doner un prix");
        double pr = sc.nextDouble();
        System.out.println("le somme de tableau " + somme(T));
        incre(T, pr);
        System.out.print("le tableau apres l'incrimentation  est :");
        afficheTab(T);
        sc.close();
    }

}