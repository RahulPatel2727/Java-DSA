public class recursion {
    static int i=1;
    public static void main(String[] args) {
        System.out.println(name(6 ));
    }
    private static int name(int n){
        if(n==1)
            return 1;
        return n*name(n-1);
    }
}
