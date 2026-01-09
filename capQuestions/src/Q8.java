import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a=0,b=1;
        for(int i=0;i<=t;i++){
            System.out.println(a);
             int c=a+b;
             a=b;
             b=c;
        }
    }
}
