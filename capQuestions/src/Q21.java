import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        if (n == 0) {
            evenCount = 1;
        }

        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            n /= 10;
        }

        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
    }
}
