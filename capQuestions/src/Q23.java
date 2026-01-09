import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int position = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            if (position % 2 == 0) {
                sum += digit;
            }

            position++;
            n /= 10;
        }

        System.out.println(sum);
    }
}
