public class recursion {
    static int i=1;
    public static void main(String[] args) {
        name(8,1);
    }
    private static void name(int n,int i){
        if(i>n)
            return;
        name(n,i+1);
        System.out.print(i+" ");   
    }
}
