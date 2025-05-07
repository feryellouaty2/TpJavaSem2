import java.util.Scanner;

public class tp2 {
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Donner un entier positif :");
            n = sc.nextInt();
        } while (n > 10);
        return n;
    }

    public static void remplirTab(float[] T, Scanner sc) {
        for (int i = 0; i < T.length; i++) {
            float note = -1;
            while (note < 0 || note > 20) {
                System.out.println("une moyenne");
                note = sc.nextFloat();
            }
            T[i] = note;
        }
    }

    public static float calculmoy(float[] T) {
        float s = 0;
        for (int i = 0; i < T.length; i++) {
            s = s + T[i];
        }
        return s / T.length;

    }

    public static int nombreNote(float[] T, float moy) {
        int c = 0;
        for (int i = 0; i < T.length; i++) {
            if (T[i] > moy) {
                c = c + 1;
            }

        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = lectureN();
        float[] T = new float[n];
        remplirTab(T, sc);
        float moy = calculmoy(T);
        int c = nombreNote(T, moy);
        System.out.println("la moyenne de la classe" + moy);
        System.out.println("le nombre des note superi moyenne la classe" + " " + c);

    }
}