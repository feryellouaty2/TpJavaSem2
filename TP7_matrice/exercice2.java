import java.util.Scanner;

public class ex2{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n,i,j,s;
        int[][] M=new int[20][20];

        while(n<0){
            System.out.println("donner un entier");
            n=sc.nextInt();
    }
    for ( i = 0; i < n; i++) {
        for ( j = 0; j < n; j++) {
            System.out.println(x:"M["+i+","+j+"]=");
             M[i][j] =sc.nextInt();
        }
        s=0;
        for ( i = 0; i < n; i++) {
            for ( j = 0; j < n; j++) {
                
                s+=M[i][i]
            }
        }
        System.out.println(s+"la somme de diagonale");
    }
}

    