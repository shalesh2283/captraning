import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i]==arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
