package level2;

import java.util.Scanner;

public class Q5 {
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double yards, feet, meters, inches;

        System.out.print("Enter yards: ");
        yards = sc.nextDouble();
        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");

        System.out.print("Enter feet: ");
        feet = sc.nextDouble();
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");

        System.out.print("Enter meters: ");
        meters = sc.nextDouble();
        System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");

        System.out.print("Enter inches: ");
        inches = sc.nextDouble();
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");
        System.out.println(inches + " inches = " + convertInchesToCentimeters(inches) + " centimeters");

    }
}
