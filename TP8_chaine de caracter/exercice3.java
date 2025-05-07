import java.util.Scanner;
import org.w3c.dom.Text; 
public class exercice3{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        String mot1,mot2,x;
        StringBuffer text;
         int l,p;
         while(text.length()>50){
            System.out.println("donner une chaine");
            text= new StringBuffer(sc.nextLine());     
         }
         while(mot1.length()>10){
            System.out.println("donner une mot ");
            mot1=sc.nextLine();
         } 
         while(mot2.length()>10){
            System.out.println("donner une mot");
            mot2=sc.nextLine(); 
         }
        if(text.indexOf(mot1)==-1){
            System.out.println(mot1+"nexiste pas ");
        }
        else{
            text = new StringBuffer(text.toString().replace(mot1, mot2));
            System.out.println("Texte après remplacement : " + text);
            }
            


        }
        
    }
}
