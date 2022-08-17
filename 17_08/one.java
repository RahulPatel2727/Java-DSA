import java.util.Scanner;

public class one{
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        int n=5;
        int i=1;
        while(i<=n){
            int j=1;
            
            while(j<=i){
                System.out.print("*"+" ");
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
}