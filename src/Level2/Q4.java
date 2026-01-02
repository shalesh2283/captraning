package Level2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int celsius = sc.nextInt();

        int farenheitResult = ((9/5)*celsius) + 32;

        System.out.println("The " + celsius + " celsius is " + farenheitResult + " fahrenheit");


    }
}
