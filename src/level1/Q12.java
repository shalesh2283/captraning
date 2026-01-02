package level1;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

        double base;
        double height;

        Scanner input = new Scanner(System.in);

        base = input.nextDouble();
        height = input.nextDouble();

        double areaInSqInches = 0.5 * base * height;
        double areaInSqCm = areaInSqInches * 2.54 * 2.54;

        System.out.println(
                "The area of the triangle in square inches is " + areaInSqInches +
                        " and in square centimeters is " + areaInSqCm
        );


    }
}
