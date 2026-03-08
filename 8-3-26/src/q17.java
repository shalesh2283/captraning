import java.util.Scanner;

public class q17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            int num=i,rev=0;
            while(num>0){
                rev=rev*10+num%10;
                num/=10;
            }
            if(rev==i) System.out.print(i+" ");
        }
    }
}
