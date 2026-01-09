import java.util.Scanner;

public class Q10 {
    public static int hcf(int a,int b)
    {
     while(b!=0){
         int c=a%b;
         a=b;
         b=c;
     }
     return a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int gcd=hcf(a,b);
        int lcm=(a*b)/gcd;
        System.out.println(lcm);
        System.out.println(gcd);
    }
}
