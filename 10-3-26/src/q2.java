import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int a=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]<arr[j] && arr[j]>arr[j+1]){
                    a=arr[j];
                }
            }
        }
        System.out.println(a);
    }
}
