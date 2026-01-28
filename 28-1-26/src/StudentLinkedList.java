import java.util.Scanner;

public class StudentLinkedList {

    static class Node {
        int roll, age;
        String name, grade;
        Node next;

        Node(int roll, String name, int age, String grade) {
            this.roll = roll;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
    }

    static Node head = null;

    static void addAtEnd(int roll, String name, int age, String grade) {
        Node newNode = new Node(roll, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    static void deleteByRoll(int roll) {
        if (head == null) return;
        if (head.roll == roll) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.roll != roll)
            temp = temp.next;
        if (temp.next != null)
            temp.next = temp.next.next;
    }

    static void search(int roll) {
        Node temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                System.out.println(temp.roll + " " + temp.name + " " + temp.age + " " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    static void updateGrade(int roll, String newGrade) {
        Node temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                temp.grade = newGrade;
                return;
            }
            temp = temp.next;
        }
    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.roll + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        addAtEnd(1, "Amit", 20, "A");
        addAtEnd(2, "Ravi", 21, "B");
        display();
        updateGrade(2, "A");
        search(2);
        deleteByRoll(1);
        display();
    }
}
