package level2;

import java.util.Scanner;

public class Q6 {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fahrenheit, celsius, pounds, kg, gallons, liters;

        System.out.print("Enter Fahrenheit: ");
        fahrenheit = sc.nextDouble();
        System.out.println(fahrenheit + " F = " + convertFahrenheitToCelsius(fahrenheit) + " C");

        System.out.print("Enter Celsius: ");
        celsius = sc.nextDouble();
        System.out.println(celsius + " C = " + convertCelsiusToFahrenheit(celsius) + " F");

        System.out.print("Enter pounds: ");
        pounds = sc.nextDouble();
        System.out.println(pounds + " lbs = " + convertPoundsToKilograms(pounds) + " kg");

        System.out.print("Enter kilograms: ");
        kg = sc.nextDouble();
        System.out.println(kg + " kg = " + convertKilogramsToPounds(kg) + " lbs");

        System.out.print("Enter gallons: ");
        gallons = sc.nextDouble();
        System.out.println(gallons + " gal = " + convertGallonsToLiters(gallons) + " liters");

        System.out.print("Enter liters: ");
        liters = sc.nextDouble();
        System.out.println(liters + " L = " + convertLitersToGallons(liters) + " gallons");
    }
}
