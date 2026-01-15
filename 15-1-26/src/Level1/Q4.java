package Level1;

import java.util.Scanner;

public class Q4 {
    public static double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    public static void displayItem(int code, String name, double price, int quantity) {
        System.out.println(code);
        System.out.println(name);
        System.out.println(price);
        System.out.println(calculateTotal(price, quantity));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        String name = sc.next();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();

        displayItem(code, name, price, quantity);
    }
}
