class tri {
    public static void main(String[] args) {
        System.out.println("donner un entier");
        int n = Clavier.lireInt();
        int[] t = new int[n];
        remplir(t);
        System.out.println("tableau initial ");
        affich(t);
        System.out.println("");
        tri(t);
        System.out.println("tableau initial ");
        affich(t);
    }

static void remplir (int []t){
    System.out.println("donner ..");
    for(int i = 0; i<t.length;i++){
        t[i] = Clavier.lireInt();}}

static int[] tri (int []t){
    int aux;
    for(int i = 0 i<t.length;i++){
        for (int j = i + 1 j<t.length;j++){
            if (t[i] > t[j]) 
            aux=t[i];
            t[i] = t[j]
            t[j] = aux ;
            return t;}

static void affich(int []t)(
    for (int i = 0 i<t.length;i++)
    System.out.print(t[i]+" ");
}
}
