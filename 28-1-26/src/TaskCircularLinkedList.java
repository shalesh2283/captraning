public class TaskCircularLinkedList {

    static class Node {
        int id;
        String name, priority;
        Node next;

        Node(int id, String name, String priority) {
            this.id = id;
            this.name = name;
            this.priority = priority;
        }
    }

    static Node head = null;

    static void addTask(int id, String name, String priority) {
        Node n = new Node(id, name, priority);
        if (head == null) {
            head = n;
            n.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = n;
        n.next = head;
    }

    static void display() {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.println(temp.id + " " + temp.name + " " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        addTask(1, "Coding", "High");
        addTask(2, "Testing", "Medium");
        display();
    }
}
