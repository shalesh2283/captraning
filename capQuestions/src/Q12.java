import java.util.Scanner;

public class Q12 {
    public static boolean isprirme(int a){
        if(a<=1){
            return false;
        }

        for(int i=2;i*i<=a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        for (int i = 1; i <= a; i++) {
            if(isprirme(i)) {
                System.out.println(i);
            }
        }
    }
}
