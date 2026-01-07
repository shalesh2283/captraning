package level1;

import java.util.Scanner;

public class Q4 {
    public static int calculateRounds(double a, double b, double c, double totalDistance) {
        double perimeter = a + b + c;
        return (int) Math.ceil(totalDistance / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double side3 = sc.nextDouble();

        int rounds = calculateRounds(side1, side2, side3, 5000);

        System.out.println("Rounds needed: " + rounds);


    }
}
