public class exercice1 {

    public static double Convertir(String ch) {
        try {
            return Double.parseDouble(ch);
        } catch (Exception e) {
            System.out.println("Cette chaine ne convertir pas!");
            return -1;
        }
    }
    public static void affichageM(String[][] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print(tableau[i][j] +" "); 
            }
            System.out.println(); 
        }
    }
    

    public static void main(String[] args) {
        double ch= Convertir("1.55");
        System.out.println(ch);
        String[][] Test = {
            {"Nom", "Ville", "Prix"},
            {"Vol1", "Tunis", "120"},
            {"Vol2", "Djerba", "180"}
        };
        System.out.println("Affichage du tableau :");
        affichageM(Test);
    }
    }