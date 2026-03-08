import java.util.*;
public class q15 {
    static int calc(int arr[]){
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i%2==0) even.add(arr[i]);
            else odd.add(arr[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        return even.get(even.size()-2)+odd.get(odd.size()-2);
    }
}
