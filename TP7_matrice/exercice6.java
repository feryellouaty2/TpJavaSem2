public class ex6{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1,n2,i,j,s;
        int[][] m=new int[20][20];
        while(n1<0){
            System.out.println("donner un entier");
            n=sc.nextInt();
        }
        while(n2<0){
            System.out.println("donner un entier");
            n=sc.nextInt();
}
for ( i = 0; i < n1; i++) {
    for ( j = 0; j < n2; j++) {
        System.out.println(x:"m["+i+","+j+"]=");
         m[i][j] =sc.nextInt();
    }
for ( i = 0; i < n1; i++) {
    s=0;
    for ( j = 0; j < n2; j++) {
        s+=m[i][j];
    }
    System.out.println("la somme  des valeur "+s);
}
}}}
