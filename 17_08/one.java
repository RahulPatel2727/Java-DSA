import java.util.*;

public class one{
    public static void main(String[] args) {
        int []arr={3,4,6,2,166,0,6,4};
        int min=arr[0];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
                index=i;
            }
        }
        System.out.println(index);

        
    }
}