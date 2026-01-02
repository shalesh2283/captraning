package level1;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {

        double perimeter;
        double side;

        Scanner input = new Scanner(System.in);

        perimeter = input.nextDouble();

        side = perimeter / 4;

        System.out.println(
                "The length of the side is " + side +
                        " whose perimeter is " + perimeter
        );


    }
}
