import java.util.Scanner;
public class tp3{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int min,max,i,j,nl,nc;
        int[][] M=new int[20][30];
        int[] T=new int[30];
        while(nl>20 ){
            System.out.println("donner un entier");
            nl=sc.nextInt();
    }
    while(nc>30 ){
            System.out.println("donner un entier");
            nc=sc.nextInt();
    }
    for ( i = 0; i < nl; i++) {
        for ( j = 0; j < nc; j++) {
            System.out.println(x:"M["+i+","+j+"]=");
             M[i][j] =sc.nextInt();
        }
    }
    for ( i = 0; i < nl; i++) {
        s+=M[i,0];
        T[i]==s;
    }
    max==T[0];
    min=T[0];
    for ( i = 1; i < nl; i++) {
        if(T[i]>max){
            max==T[i];
        }
        
    }
    for ( i = 1; i < nl; i++) {
        if(T[i]<min){
            min==T[i];
        }
    System.out.println(max +"maximaume ");
    System.out.println(min +"minimaume");
    }
}
}


