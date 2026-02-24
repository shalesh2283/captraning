import java.util.*;

public class aq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int totalSum = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        int leftSum = 0;
        boolean found = false;

        for(int i = 0; i < n - 1; i++){
            leftSum += arr[i];

            if(leftSum == totalSum - leftSum){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}