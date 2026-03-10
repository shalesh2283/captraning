import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }
        int num=0;

        for (int i=0;i<arr.length;i++){
            if(arr[i]!=0) {
                arr[num++] = arr[i];

            }
        }
        while(num<n){
            arr[num++]=0;
        }
        for(int b: arr){
            System.out.print(b);
        }
    }
}
