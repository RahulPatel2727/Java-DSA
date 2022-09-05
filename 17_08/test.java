import java.util.HashMap;
import java.util.Map;

public class test{
    public static void main(String[] args) {
        int []arr= {2,7,11,15};
        int t=9;
        HashMap<Integer,Integer> mp = new HashMap<>();
        // for(int i =0;i<arr.length;i++){
        //     if(mp.containsKey(t-arr[i]))
        // }
        for (int i = 0; i < arr.length; i++) {
            mp.put( arr[i],i);
        }
        System.out.println(mp);
        System.out.println(mp.containsKey(t-arr[0]));
        System.out.println(mp.get(t-arr[0]));
    }
}