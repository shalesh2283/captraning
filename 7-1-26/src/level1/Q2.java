package level1;

import java.util.Scanner;

public class Q2 {
        public static int maxHandshakes(int n) {
            return (n * (n - 1)) / 2;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of students: ");
            int students = sc.nextInt();

            int handshakes = maxHandshakes(students);

            System.out.println("Maximum handshakes: " + handshakes);
        }
}
