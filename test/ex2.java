import java.util.Scanner; 
public class ex2 {
    public static int addition(int a, int b) { 
    return a + b; 
} 
    public static  float soustraction(int a, int b) {
     return a - b; }
      public static float multiplication(int a, int b){
       return a * b; 
    } 
    public static float division(int a, int b) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("donner un autre number");
            b= sc.nextInt(); 
        }while (!(b != 0));
    return a / b; 
} 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int a, b;
        String op;
    System.out.print("entrez nombre 1 ");
    a =sc.nextInt();
    System.out.print("entrez le second nombre 2 "); 
    b =sc.nextInt(); 
    System.out.print("Choisissez opération (+, -, *, /) ");
    op = sc.next();
     float r=0;
     switch (op) { 
        case "+":r=addition(a, b); break;
        case "-":r=soustraction(a, b); break;
        case "*":r=multiplication(a, b); break;
        case "/":r=division( a, b); break;
default: System.out.println("Opération invalide"); 
}
System.out.println("Résultat  " + r);
 }
}