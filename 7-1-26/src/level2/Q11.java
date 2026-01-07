package level2;

import java.util.Scanner;

public class Q11 {
    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double[] roots = new double[2];
            roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
            return roots;
        } else if (delta == 0) {
            double[] roots = new double[1];
            roots[0] = -b / (2 * a);
            return roots;
        } else {
            return new double[0];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 2) {
            System.out.println("Root1 = " + roots[0]);
            System.out.println("Root2 = " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("Root = " + roots[0]);
        } else {
            System.out.println("No real roots");
        }

    }
}
