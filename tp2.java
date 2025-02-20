import java.util.Scanner;

public class tp2{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int p,s,i,j,nl,nc;
        int[][] M=new int[30][30]
        while(nl>30 || nl<0){
            System.out.println("donner un entier");
            nl=sc.nextInt();
    }
    while(nc>30 || nl<0){
            System.out.println("donner un entier");
            nc=sc.nextInt();
    }
    for ( i = 0; i < nl; i++) {
        for ( j = 0; j < nc; j++) {
            System.out.println(x:"M["+i+","+j+"]=");
             M[i][j] =sc.nextInt();
        }
    }
    s=0;
    p=1;
    m=0;
    for ( i = 0; i < nl; i++) {
        for ( j = 0; j < nc; j++) {
            s+=M[i][j];
            p*=M[i][j];
        }
    }
    m=s/nl*nc
    System.out.println(s+"la somme de matrice  ");
    System.out.println(p+"le produit de la matrice");
    System.out.println(m+"la moyenne de la matrice");
    

    }