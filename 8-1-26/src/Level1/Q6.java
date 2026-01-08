package Level1;

import java.util.Scanner;

public class Q6 {
    public static void generateException(String text) {
        if (2 > 1) {
            throw new IllegalArgumentException();
        }
        text.substring(2, 1);
    }

    public static void handleException(String text) {
        try {
            if (2 > 1) {
                throw new IllegalArgumentException();
            }
            text.substring(2, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception generated");
        }

        handleException(text);
    }
}
