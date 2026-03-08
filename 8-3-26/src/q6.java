import java.util.*;
public class q6 {
    static int calc(int arr[]){
        if(arr.length<=3) return 0;
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i%2==0) even.add(arr[i]);
            else odd.add(arr[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        int a=even.get(even.size()-2);
        int b=odd.get(1);
        return a+b;
    }
}
