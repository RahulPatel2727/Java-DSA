public class reverse_arra {
    public static void main(String[] args) {
        int []arr={2,5,8,1,2,3,9,5};
        int i=0,j=arr.length-1;
        while(i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;i++;j--;
        }
        for(int ii:arr)
            System.out.print(ii+" ");
            // System.out.println();
    }
    
}
