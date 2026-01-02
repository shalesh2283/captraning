package Level2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        double number1;
        double number2;

        Scanner input = new Scanner(System.in);

        number1 = input.nextDouble();
        number2 = input.nextDouble();

        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 * number2;
        double quotient = number1 / number2;

        System.out.println(
                "For the numbers " + number1 + " and " + number2 + ", " +
                        "addition = " + sum + ", " +
                        "subtraction = " + difference + ", " +
                        "multiplication = " + product + ", " +
                        "and division = " + quotient
        );


    }
}
