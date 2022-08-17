import java.util.Scanner;

public class one{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        if(a>=75)
            System.out.println("A");
        else if(a<75 && a>=65)
            System.out.println("B");
    }
}