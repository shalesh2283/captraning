import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String s = input.next();
        StringBuilder a = new StringBuilder();
        for(int i = 0; i < n; i++) {
            a.append(s);
        }
        System.out.print(a.toString());
    }
}
