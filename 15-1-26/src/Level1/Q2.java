package Level1;

import java.util.Scanner;

public class Q2 {

    public static double findArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double findCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

        System.out.println(findArea(radius));
        System.out.println(findCircumference(radius));
    }
}
