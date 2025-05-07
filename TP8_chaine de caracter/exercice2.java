import java.util.Scanner;
import org.w3c.dom.Text; 
public class exercice2{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        String Texte,mot1,mot2,x;
         int l,p;
        System.out.println("donner une chaine");
        text=sc.nextLine();     
        System.out.println("donner une mot ");
        mot1=sc.nextLine(); 
        System.out.println("donner une mot");
        mot2=sc.nextLine(); 
        if(text.indexOf(mot1)==-1){
            System.out.println(mot1+"nexiste pas ");
        }
        else{
            p=text.indexOf(mot1);
            l=mot1.length();
            x=Texte.replace(mot1, mot2);
            System.out.println("le nouveau texte est"+ x); 
            }
            


        }
        
    }
}
