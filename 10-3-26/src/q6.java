import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = input.next();
        }
        int count = 0;

        for (int i = 0; i < n; i++) {
            StringBuilder sb= new StringBuilder(str[i]);
            String s = sb.reverse().toString();
            if(str[i].equals(s)){
                count++;
            }
        }
        System.out.println(count);
    }
}
