import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = input.nextInt();
        }
        for (int i=0;i<n;i++) {
            if(arr[i]<0){
                arr[i]=-arr[i];
            }
        }
            int left=arr[0];
            int right=arr[arr.length-1];
            int mid=left+(right-left)/2;

        System.out.println(mid);
    }
}
