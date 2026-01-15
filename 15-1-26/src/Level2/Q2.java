package Level2;

import java.util.Scanner;

public class Q2 {
    public static double deposit(double balance, double amount) {
        return balance + amount;
    }

    public static double withdraw(double balance, double amount) {
        if (amount <= balance) {
            return balance - amount;
        }
        return balance;
    }

    public static void displayBalance(String holder, int accountNumber, double balance) {
        System.out.println(holder);
        System.out.println(accountNumber);
        System.out.println(balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String accountHolder = sc.next();
        int accountNumber = sc.nextInt();
        double balance = sc.nextDouble();

        double depositAmount = sc.nextDouble();
        balance = deposit(balance, depositAmount);

        double withdrawAmount = sc.nextDouble();
        balance = withdraw(balance, withdrawAmount);

        displayBalance(accountHolder, accountNumber, balance);
    }
}
