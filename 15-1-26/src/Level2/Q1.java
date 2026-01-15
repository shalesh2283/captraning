package Level2;

import java.util.Scanner;

public class Q1 {
    public static char calculateGrade(int marks) {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void displayStudent(String name, int rollNumber, int marks, char grade) {
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(marks);
        System.out.println(grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int rollNumber = sc.nextInt();
        int marks = sc.nextInt();

        char grade = calculateGrade(marks);
        displayStudent(name, rollNumber, marks, grade);
    }
}
