package level2;

import java.util.Scanner;

public class Q4 {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km, miles, meters, feet;

        System.out.print("Enter distance in kilometers: ");
        km = sc.nextDouble();
        System.out.println(km + " km = " + convertKmToMiles(km) + " miles");

        System.out.print("Enter distance in miles: ");
        miles = sc.nextDouble();
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");

        System.out.print("Enter distance in meters: ");
        meters = sc.nextDouble();
        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");

        System.out.print("Enter distance in feet: ");
        feet = sc.nextDouble();
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");

    }
}
