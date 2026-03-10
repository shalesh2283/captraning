import java.util.Scanner;

public class q11 {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1=input.nextLine();
        String s2=input.nextLine();

            if(s1.contains(s2)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

    }
}
