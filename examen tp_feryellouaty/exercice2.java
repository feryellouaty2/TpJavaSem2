import java.util.Scanner;
public class exercice2 {

    public static String[][] decVols() {
        return new String[][] {
                { "1", "Tozeur", "Djerba", "Ab01", "A1", "156" },
                { "2", "Tozeur", "Tunis", "Ab02", "A2", "250" },
                { "3", "Tunis", "Djerba", "Ab03", "A1", "140"
            
            
            },
                { "4", "Djerba", "Sfax", "Ab04", "A2", "120" },
        };
    }

    public static void afficherVols(String[][] vols, String choix) {
        System.out.println("Vols correspondant : ");
        for (String[] vol : vols) {
            if (vol[2].toUpperCase().startsWith(choix.toUpperCase())) {
                afficherVol(vol);
            }
        }
    }

    public static void remise(String[][] vols) {
        for (String[] vol : vols) {
            try {
                double prix = Double.parseDouble(vol[5]);
                prix *= 0.8;
                vol[5] = String.valueOf(prix);
            } catch (NumberFormatException e) {
                System.out.println("Erreur de prix pour le vol ");
            }
        }
    }

    public static double Convertir(String ch) {
        try {
            return Double.parseDouble(ch);
        } catch (Exception e) {
            System.out.println("Cette chaine ne peut pas être convertie !");
            return -1;
        }
    }

    public static void afftous(String[][] vols) {
        System.out.println("\nApplication d'une remise de 20% sur tous les vols :");
        for (String[] vol : vols) {
            afficherVol(vol);
        }
    }

    public static void afficherVol(String[] vol) {
        System.out.println("NumVol: " + vol[0] + ", Vdep: " + vol[1] +
                ", vdest: " + vol[2] + ", CodeAv: " + vol[3] +
                ", ClassAv: " + vol[4] + ", PrixVol: " + vol[5] + " dt");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] vols = decVols();

        System.out.print("Entrez la première lettre de la ville de destination : ");
        String choix = scanner.next();

        afficherVols(vols, choix);
        remise(vols);
        afftous(vols);

        scanner.close();
    }
}
