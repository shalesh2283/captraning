import java.util.*;

public class aq5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        ArrayList<Integer> a = new ArrayList<>();

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[n - 1];
        a.add(max);

        for(int i = n - 2; i >= 0; i--){
            if(arr[i] > max){
                max = arr[i];
                a.add(max);
            }
        }

        System.out.println(a);
    }
}