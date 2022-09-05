import java.util.*;
public class New {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Long m  = s.nextLong();
        

        int []nums={2,1,-1};
        int left=0,sum=0;
        for(int o:nums){
            sum+=o;
        }
        for(int i=0;i<nums.length;i++){
            if((sum-left-nums[i])==left){
                System.out.println(i);
                break;
            }
            left+=nums[i];
        }
        System.out.println(left+" "+sum);
        
    }
}
