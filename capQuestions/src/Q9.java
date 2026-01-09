import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int tem=n;
        int c=n;
        int count=0;
        int sum=0;
        while(c>0){
            count++;
            c/=10;
        }
        while(n>0){
            int digit=n%10;
            sum+=Math.pow(digit,count);
            n/=10;
        }
        if(sum==tem){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
