import java.util.Arrays;

public class q7 {
    static int ProductSmallestPair(int sum,int arr[]){
        if(arr==null||arr.length<2) return -1;
        Arrays.sort(arr);
        if(arr[0]+arr[1]<=sum) return arr[0]*arr[1];
        return 0;
    }
}
