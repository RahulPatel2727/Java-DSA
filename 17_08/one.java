import java.util.*;

public class one{
    public static void main(String[] args) {
        // 
        int n=47;
        int lo=1,hi=n;
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(mid*mid<=n){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid+1;
            }
        }
    }
}