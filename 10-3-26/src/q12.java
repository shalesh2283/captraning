import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int [] arr=new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=input.nextInt();
        }
        int total= n*(n+1)/2;
        int sum=0;
        int mis=0;
        for(int i=0;i<n-1;i++){
            sum+=arr[i];
        }
        mis=total-sum;
        System.out.println(mis);
    }
}
