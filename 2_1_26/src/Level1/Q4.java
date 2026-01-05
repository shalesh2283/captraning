package Level1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sumOfNaturalNumbers = (n*(n+1))/2;

        System.out.println("The sum of first " + n + " natural numbers is " + sumOfNaturalNumbers);
    }
}
