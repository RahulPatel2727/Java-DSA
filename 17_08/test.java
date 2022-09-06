import java.util.HashMap;
import java.util.Map;

public class test{
    public static void main(String[] args) {
        int []arr= {2,7,11,15};
        int n = arr.length;
        int t=11;
        boolean f = false;
        int s=0,e=n-1,mid= s+ (e-s)/2;
        System.out.println(sqrt(63));
        
    }
    private static int sqrt(int m){
        int s=0,e=m,mid=s+(e-s)/2;
        while(s<=e){
            if((mid*mid)>m){
                e=mid-1;
                mid=s+(e-s)/2;
            }
            else if((mid*mid)<m){
                s=mid+1;
                mid=s+(e-s)/2;
            }
            if((mid*mid)==m)
                return mid;
            s++;e--;
        }
        return mid;
    }
}