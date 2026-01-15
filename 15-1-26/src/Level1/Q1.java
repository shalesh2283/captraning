package Level1;

import java.util.Scanner;

public class Q1 {
    public static void displayEmployee(String name, int id, double salary) {
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int id = sc.nextInt();
        double salary = sc.nextDouble();

        displayEmployee(name, id, salary);
    }
}
