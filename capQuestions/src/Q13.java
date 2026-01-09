import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String s1 = s.replace(" ","-");
        for(int i=0;i<s.length();i++) {
            System.out.print(s1.charAt(i));
        }
    }
}
