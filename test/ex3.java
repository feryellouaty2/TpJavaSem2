import java.util.Scanner;
 public class ex3 { 
     public static boolean estInf(String verbe) {
        return
        verbe.endsWith("er") || verbe.endsWith("ir") || verbe.endsWith("re") ||
        verbe.endsWith("oir"); 
} 
    public static String groupe(String verbe){
         if (verbe.equals("aller")) { 
             return "Troisième groupe";
 }
        else if (verbe.endsWith("er")) {
         return "Premier groupe"; 
        } 
        else if(verbe.endsWith("ir")) {
    
    return "Deuxième groupe"; 
} 
    else { 
        return "Troisième groupe"; 
    }
 }
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Entrez un verbe à l'infinitif : ");
    String verbe = scanner.nextLine().toLowerCase();

    if (!estInf(verbe)) {
        System.out.println("Ce mot ne semble pas être un verbe à l'infinitif.");
    } else {
        String groupeVerbe = groupe(verbe);
        System.out.println("Le verbe \"" + verbe + "\" appartient au : " + groupeVerbe);
    }

    scanner.close();
}
}