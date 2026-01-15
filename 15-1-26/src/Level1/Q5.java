package Level1;

import java.util.Scanner;

public class Q5 {
    public static void displayPhone(String brand, String model, double price) {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String brand = sc.next();
        String model = sc.next();
        double price = sc.nextDouble();

        displayPhone(brand, model, price);
    }
}
