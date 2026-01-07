package level2;

import java.util.Scanner;

public class Q9 {
    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        else if (n1 == n2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is positive and even");
                } else {
                    System.out.println(numbers[i] + " is positive and odd");
                }
            } else {
                System.out.println(numbers[i] + " is negative");
            }
        }
        int result = compare(numbers[0], numbers[4]);
        if (result == 1) System.out.println("First number is greater than last number");
        else if (result == 0) System.out.println("First number is equal to last number");
        else System.out.println("First number is less than last number");
    }
}
