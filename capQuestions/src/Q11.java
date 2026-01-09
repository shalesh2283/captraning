import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        if(a<=1){
            System.out.println("not");
        }
        boolean bool=true;
        for(int i=2;i*i<=a;i++){
            if(a%i==0){
                bool=false;
            }
        }
        if(bool){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
