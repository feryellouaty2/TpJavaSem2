import java.util.Scanner;

public class tp1{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int i,j,x,nl,nc;
        boolean test=false;
        int[][] M=new int[50][50]
while(nl>50){
        System.out.println("donner un entier");
        nl=sc.nextInt();
}
while(nc>50){
        System.out.println("donner un entier");
        nc=sc.nextInt();
}
        for ( i = 0; i < nl; i++) {
            for ( j = 0; j < nc; j++) {
                do{
                    System.out.println(x:"M["+i+","+j+"]=");
                 M[i][j] =sc.nextInt();
                }
                while(M[i][j]%2 !=0);     
            }
        }
        do{
                System.out.println("donner x");
                 x =sc.nextInt();

                }while(x %2 !=0);
        i=0;
        j=0;
        while(!test && i<nl && j<nc){
            if(M[i][j]==x){
                test=true;
            }
            else if(i<nl &&& j==(nc-1)){
                j=0;
                i++
            }
            else{
                j++
            }
        }
        if(test){
            System.out.println(x+"existe");
        }
        else{
            System.out.println(x+"n'existe pas ");
        }

                 }
                

            }
            }

    }
}