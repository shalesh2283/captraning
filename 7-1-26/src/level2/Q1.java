package level2;

import java.util.Scanner;

public class Q1 {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[index++] = i;
        }

        return factors;
    }

    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    public static int productOfArray(int[] arr) {
        int product = 1;
        for (int num : arr) product *= num;
        return product;
    }

    public static int sumOfSquares(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += Math.pow(num, 2);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] factors = findFactors(n);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();
        System.out.println("Sum of factors: " + sumOfArray(factors));
        System.out.println("Product of factors: " + productOfArray(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
    }
}
