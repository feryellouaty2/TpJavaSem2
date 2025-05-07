import java.util.Scanner;
public class ex1{
    public  static lecture() {
        Scanner sc=new Scanner(System.in);
        int n;
     while(n<0){
         System.Out.Println("donner un entier");
         n=sc.nextInt();
     }
     return n;
    }
    public  static compter(int n) {
        int c=0;
        while(n!=0){
            n = n / 10;
            c=c+1;
        }
return c;
        }
 public static void main(String[] args) {
     int entierposi=lecture();
     int nbrchiffre=compter(entierposi);
System.out.Println("le nobree"+nbrchiffre) ;   
}
    
}
}