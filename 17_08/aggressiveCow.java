import java.util.Arrays;
import java.util.Scanner;

public class aggressiveCow{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int nos=s.nextInt();
            int noc=s.nextInt();
            int []stalls=new int[nos];
            for(int i=0;i<stalls.length;i++){
                stalls[i]=s.nextInt();
            }
            Arrays.sort(stalls);
        }
    }

    public static int largestminimumdistance(int[]stalls,int noc){
        int lo=0;int hi=stalls[stalls.length-1]-stalls[0];
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(isitpossible(stalls,mid,noc)==true){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int []stalls,int mid, int noc){
        int cow=1;
        int pos=stalls[0];
        int i=1;
        while(i<stalls.length){
            if(stalls[i]-pos>=mid){
                cow++;
                pos=stalls[i];
            }
            if(cow>=noc){
                return true;
            }
            i++;
        }
        return false;
    }

}