package Level1;

import java.util.Scanner;

public class Q3 {
    public static void displayBook(String title, String author, double price) {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.next();
        String author = sc.next();
        double price = sc.nextDouble();

        displayBook(title, author, price);
    }
}
